package com.example.openbanktechtest.main.domain.list

import com.example.data.repository.DataResponse
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetListUseCaseImpl (private val listDataSource: ListDataSource): GetListUseCase {
    override fun invoke(p1: ListRequest): Flow<List<CharacterDomainModel>> = flow {
        when (val response = listDataSource.getList(p1)) {
            is DataResponse.Failure -> throw response.error
            is DataResponse.Success -> {
                emit(response.data)
            }
        }
    }

}