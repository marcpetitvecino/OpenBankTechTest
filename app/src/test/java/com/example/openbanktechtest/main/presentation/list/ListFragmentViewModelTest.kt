package com.example.openbanktechtest.main.presentation.list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.openbanktechtest.getListRequestData
import com.example.openbanktechtest.getResponseItemData
import com.example.openbanktechtest.main.domain.list.GetListUseCase
import io.mockk.*
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.*


class ListFragmentViewModelTest {

    private val mainThreadSurrogate = newSingleThreadContext("ViewModel thread")

    private lateinit var viewModel: ListFragmentViewModel

    @RelaxedMockK
    private lateinit var observer: Observer<ListFragmentViewState>

    @RelaxedMockK
    private lateinit var getListUseCase: GetListUseCase

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    @Before
    fun setUp() {
        Dispatchers.setMain(mainThreadSurrogate)
        MockKAnnotations.init(this)
        viewModel = ListFragmentViewModel(getListUseCase)
    }

    @ExperimentalCoroutinesApi
    @After
    fun tearDown() {
        Dispatchers.resetMain()
        mainThreadSurrogate.close()
    }

    @Test
    fun `given viewModel When InitEvent then Loading State`(): Unit = runBlocking {
        launch(Dispatchers.Main) {
            viewModel.viewState.observeForever(observer)
            viewModel.dispatch(ListFragmentEvent.InitEvent)

            val captor = slot<ListFragmentViewState>()
            verify { observer.onChanged(capture(captor)) }

            Assert.assertTrue(captor.captured is ListFragmentViewState.Loading)
        }
    }


}