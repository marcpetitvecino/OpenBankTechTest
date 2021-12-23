package com.example.openbanktechtest.main.data.list

import com.google.gson.Gson
import org.junit.Test

class ThumbnailDTOTest {
    private val response = "{\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        }"

    @Test
    fun `given response when parsing dto is valid`() {
        val output = Gson().fromJson(response, ThumbnailDTO::class.java)
        assert(output != null)
    }
}