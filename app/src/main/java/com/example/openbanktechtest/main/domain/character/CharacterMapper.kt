package com.example.openbanktechtest.main.domain.character

import com.example.data.repository.Mapper
import com.example.openbanktechtest.main.data.character.CharacterDTO

class CharacterMapper: Mapper<CharacterDomainModel, CharacterDTO> {

    companion object {
        const val NAME = "CharacterMapper"
    }

    override fun mapToDomainModel(dto: CharacterDTO): CharacterDomainModel {
        return with(dto) {
            CharacterDomainModel(
                id = id,
                name = name,
                description = description,
                imageUrl = "${dto.thumbnail.path}.${dto.thumbnail.extension}"
            )
        }
    }
}