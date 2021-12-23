package com.example.openbanktechtest.main.data.character

import com.example.openbanktechtest.main.data.list.ThumbnailDTO
import com.google.gson.annotations.SerializedName

data class CharacterDTO (
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("thumbnail") val thumbnail: ThumbnailDTO
        )