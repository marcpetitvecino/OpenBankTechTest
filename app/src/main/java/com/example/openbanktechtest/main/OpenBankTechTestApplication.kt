package com.example.openbanktechtest.main

import android.app.Application
import com.example.openbanktechtest.main.di.appModule
import com.example.openbanktechtest.main.di.list.listModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

class OpenBankTechTestApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@OpenBankTechTestApplication)
            modules(
                appModule,
                listModule
            )
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }
}