package com.example.openbanktechtest.main.di

import com.example.data.network.NetworkClient
import com.example.data.repository.RetrofitNetworkClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule = module {
    single<NetworkClient<Retrofit>>(named(NetworkClient.NAME)) {
        RetrofitNetworkClient()
    }

}