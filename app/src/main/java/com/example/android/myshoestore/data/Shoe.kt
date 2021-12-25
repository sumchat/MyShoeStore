package com.example.android.myshoestore.data

import androidx.annotation.DrawableRes

data class Shoe (
    val id: Long,
    var name: String,
    var companyName:String,
    var size:Int,
    @DrawableRes
    val image: Int?,
    var description: String
        )

