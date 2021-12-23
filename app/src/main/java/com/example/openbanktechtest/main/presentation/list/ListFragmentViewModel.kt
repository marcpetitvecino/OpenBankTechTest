package com.example.openbanktechtest.main.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.domain.list.GetListUseCase
import com.example.openbanktechtest.main.domain.list.ListRequest
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

sealed class ListFragmentEvent {
    object InitEvent: ListFragmentEvent()
}

sealed class ListFragmentViewState {
    class ShowData(val list: List<CharacterDomainModel>): ListFragmentViewState()
    object Loading: ListFragmentViewState()
    object Error: ListFragmentViewState()
}

class ListFragmentViewModel(private val getListUseCase: GetListUseCase): ViewModel() {

    private val mutableViewState: MutableLiveData<ListFragmentViewState> = MutableLiveData()
    val viewState: LiveData<ListFragmentViewState>
        get() = mutableViewState

    fun dispatch(event: ListFragmentEvent) {
        when (event) {
            is ListFragmentEvent.InitEvent -> getCharacterList()
        }
    }

    private fun getCharacterList(limit: Int = 100) {
        mutableViewState.postValue(ListFragmentViewState.Loading)
        viewModelScope.launch {
            getListUseCase(ListRequest(limit = limit)).catch {
                mutableViewState.postValue(ListFragmentViewState.Error)
            }.collect {
                mutableViewState.postValue(ListFragmentViewState.ShowData(it))
            }
        }
    }

}