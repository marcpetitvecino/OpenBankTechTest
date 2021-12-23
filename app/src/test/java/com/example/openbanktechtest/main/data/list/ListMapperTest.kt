package com.example.openbanktechtest.main.data.list

import com.example.data.repository.Mapper
import com.example.openbanktechtest.getResponseItemData
import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.domain.character.CharacterMapper
import com.example.openbanktechtest.responseDTO
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ListMapperTest {
    private lateinit var mapper: Mapper<List<CharacterDomainModel>, ResponseDTO>
    private lateinit var childMapper: Mapper<CharacterDomainModel, CharacterDTO>

    @Before
    fun setUp() {
        childMapper = CharacterMapper()
        mapper = ListMapper(childMapper)
    }

    @Test
    fun `Given certain Response DTO when mapping then should return proper List Domain`() {
        val expected = getResponseItemData().data.characters
        val input = responseDTO

        val actual = mapper.mapToDomainModel(input)

        assertEquals(expected, actual)
    }
}