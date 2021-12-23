package com.example.openbanktechtest.main.domain.character

import com.example.data.repository.Mapper
import com.example.openbanktechtest.characterDTO
import com.example.openbanktechtest.getResponseItemData
import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.example.openbanktechtest.main.data.list.ListMapper
import com.example.openbanktechtest.responseDTO
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class CharacterMapperTest {
    private lateinit var mapper: Mapper<CharacterDomainModel, CharacterDTO>

    @Before
    fun setUp() {
        mapper = CharacterMapper()
    }

    @Test
    fun `Given certain Character DTO when mapping then should return proper Character Domain`() {
        val expected = getResponseItemData().data.characters[0]
        val input = characterDTO

        val actual = mapper.mapToDomainModel(input)

        assertEquals(expected, actual)
    }
}