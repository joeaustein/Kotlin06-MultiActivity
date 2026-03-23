package com.example.kotlin06_multiactivity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val userName: String,
    val n1Peso: Int,
    val n1: Double
): Parcelable