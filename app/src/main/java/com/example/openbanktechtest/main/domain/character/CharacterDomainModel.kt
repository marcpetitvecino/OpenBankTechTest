package com.example.openbanktechtest.main.domain.character

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CharacterDomainModel (
            val id: Int,
            val name: String,
            val description: String,
            val imageUrl: String
        ): Parcelable