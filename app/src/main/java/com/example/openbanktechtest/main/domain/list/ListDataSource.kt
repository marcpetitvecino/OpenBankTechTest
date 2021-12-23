package com.example.openbanktechtest.main.domain.list

import com.example.data.repository.DataResponse
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel

interface ListDataSource {
    suspend fun getList(request: ListRequest): DataResponse<List<CharacterDomainModel>>
}