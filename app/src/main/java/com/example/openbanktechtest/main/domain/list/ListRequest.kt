package com.example.openbanktechtest.main.domain.list

import com.google.gson.annotations.SerializedName

data class ListRequest (
    @SerializedName("limit") val limit: Int
        )