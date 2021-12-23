package com.example.openbanktechtest

import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.example.openbanktechtest.main.data.list.ListDTO
import com.example.openbanktechtest.main.data.list.ThumbnailDTO
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.domain.list.ListDomainModel
import com.example.openbanktechtest.main.domain.list.ListRequest
import com.example.openbanktechtest.main.domain.response.ResponseDomainModel

fun getResponseItemData() = ResponseDomainModel(
        ListDomainModel(
            listOf(
                CharacterDomainModel(
                    0,
                    "Superman",
                    "Superman desc",
                    "test.jpg",
                )
            )
        )
)

fun getListRequestData() = ListRequest(
    limit = 1
)

val responseDTO = ResponseDTO (
            ListDTO(
                listOf(
                    CharacterDTO(
                        0,
                        "Superman",
                        "Superman desc",
                        ThumbnailDTO(
                            "test",
                            "jpg"
                        )
                    )
                )
            )
        )

val characterDTO = CharacterDTO(
        0,
        "Superman",
        "Superman desc",
        ThumbnailDTO(
            "test",
            "jpg"
        )
    )