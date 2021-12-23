package com.example.openbanktechtest.main.data.list

import com.google.gson.annotations.SerializedName

data class ThumbnailDTO (
        @SerializedName("path") val path: String,
        @SerializedName("extension") val extension: String
        )