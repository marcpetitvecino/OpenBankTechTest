package com.example.openbanktechtest.main.data.list

import com.example.data.network.NetworkClient
import com.example.data.repository.DataResponse
import com.example.data.repository.Mapper
import com.example.data.repository.RetrofitDataSource
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.domain.list.ListDataSource
import com.example.openbanktechtest.main.domain.list.ListDomainModel
import com.example.openbanktechtest.main.domain.list.ListRequest
import com.example.openbanktechtest.main.domain.response.ResponseDomainModel
import retrofit2.Retrofit

class ListDataSourceImpl(
    client: NetworkClient<Retrofit>,
    private val mapper: Mapper<List<CharacterDomainModel>, ResponseDTO>
): ListDataSource, RetrofitDataSource<ListAPI, List<CharacterDomainModel>, ResponseDTO>(client) {
    override suspend fun getList(request: ListRequest): DataResponse<List<CharacterDomainModel>> {
        return fetch(ListPredicate(mapper, request))
    }
}