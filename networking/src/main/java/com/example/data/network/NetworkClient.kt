package com.example.data.network



interface NetworkClient<Client> {
    fun client(): Client

    companion object {
        const val NAME = "NetworkClient"
    }
}
