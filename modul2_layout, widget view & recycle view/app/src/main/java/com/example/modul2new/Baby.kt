package com.example.modul2new

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Baby(
    val imgBaby: Int,
    val nameBaby: String,
    val descBaby: String
) : Parcelable
