package com.example.exploringnavigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonModel(
    val name: String = "",
    val age: Int = 0,
    val street: String = "",
    val addressNumber: String = ""
) : Parcelable
