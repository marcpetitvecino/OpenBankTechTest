package com.example.openbanktechtest.main.data.list

import com.example.data.repository.Mapper
import com.example.data.repository.RetrofitPredicate
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.domain.list.ListRequest
import com.example.openbanktechtest.main.domain.response.ResponseDomainModel

class ListPredicate(
    private val mapper: Mapper<List<CharacterDomainModel>, ResponseDTO>,
    private val request: ListRequest): RetrofitPredicate<ListAPI, List<CharacterDomainModel>, ResponseDTO> {

    override fun mapper(): Mapper<List<CharacterDomainModel>, ResponseDTO> = mapper

    override fun service(): Class<ListAPI> = ListAPI::class.java

    override fun endpoint(): suspend (ListAPI) -> ResponseDTO = { it.getCharacterList(request.limit) }

}