package com.example.openbanktechtest.main.data.list

import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.google.gson.annotations.SerializedName

data class ListDTO (
        @SerializedName("results") val results: List<CharacterDTO>
        )