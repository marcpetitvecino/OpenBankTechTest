package com.example.openbanktechtest.main.data.list

import com.example.openbanktechtest.main.data.response.ResponseDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface ListAPI {

    companion object {
        const val LIST_PATH = "/v1/public/characters?ts=1&apikey=c52efefb2223d6c12ca80626c74965a1&hash=7dd9c7def2e188132128e1f03d3727fa"
    }

        @GET(LIST_PATH)
        suspend fun getCharacterList(@Query("limit") limit: Int): ResponseDTO
}