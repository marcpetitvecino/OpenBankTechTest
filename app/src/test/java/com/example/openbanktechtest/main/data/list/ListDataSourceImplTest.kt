package com.example.openbanktechtest.main.data.list

import com.example.data.network.NetworkClient
import com.example.data.repository.DataResponse
import com.example.openbanktechtest.getListRequestData
import com.example.openbanktechtest.getResponseItemData
import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterMapper
import com.example.openbanktechtest.main.domain.list.ListDataSource
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit

class ListDataSourceImplTest {

    private lateinit var dataSource: ListDataSource

    private val mapper = ListMapper(CharacterMapper())
    private val networkClient = mockk<NetworkClient<Retrofit>>()
    private val client = mockk<Retrofit>()
    private val service = mockk<ListAPI>()

    private val dto = ResponseDTO(
        ListDTO(
            listOf(
                CharacterDTO(
                    0,
                    "Superman",
                    "Superman desc",
                    ThumbnailDTO("test", "jpg"))
            )
        )
    )

    @Before
    fun setUp() {
        stubFetch()
        dataSource = ListDataSourceImpl(networkClient, mapper)
    }

    private fun stubFetch() {
        every { networkClient.client() } returns client
        every { client.create(ListAPI::class.java) } returns service
    }

    @Test
    fun `given success network when get list then return fetch data`() {
        runBlocking {
            coEvery { service.getCharacterList(1) } returns dto
            val expected = getResponseItemData().data.characters
            val actual = dataSource.getList(getListRequestData())
            assertEquals(expected, (actual as DataResponse.Success).data)
        }
    }

    @Test
    fun `given failure network when get list then return failure`() {
        runBlocking {
            val expected = mockk<Throwable>()
            coEvery { service.getCharacterList(1) } throws expected

            val actual = dataSource.getList(getListRequestData())
            assertEquals(expected, (actual as DataResponse.Failure).error)
        }
    }
}