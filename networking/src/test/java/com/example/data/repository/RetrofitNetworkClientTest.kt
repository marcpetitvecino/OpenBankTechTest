package com.example.data.repository

import android.content.Context
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RetrofitNetworkClientTest {


    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun given_configuration_when_buildClient_then_clientIsConfigured() {

        val networkClient =
            RetrofitNetworkClient()
        val client = networkClient.client()
        Assert.assertNotNull(client)
        Assert.assertNotNull(client.baseUrl())
    }
}