package com.whatthefar.data.model.weather

import com.google.gson.annotations.SerializedName

data class WindData(
        @SerializedName("speed")
        val speed: Double,
        @SerializedName("deg")
        val deg: Int
)