package com.example.openbanktechtest.main.data.response

import com.example.openbanktechtest.main.data.list.ListDTO
import com.google.gson.annotations.SerializedName

data class ResponseDTO (
            @SerializedName("data") val data: ListDTO
)