package com.example.openbanktechtest.main.data.list

import com.example.data.repository.Mapper
import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel

class ListMapper(
    private val characterMapper: Mapper<CharacterDomainModel, CharacterDTO>
): Mapper<List<CharacterDomainModel>, ResponseDTO> {

    companion object {
        const val NAME = "ListMapper"
    }

    override fun mapToDomainModel(dto: ResponseDTO): List<CharacterDomainModel> {
        return dto.data.results.map { characterMapper.mapToDomainModel(it) }
    }
}