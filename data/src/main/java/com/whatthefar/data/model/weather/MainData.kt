package com.whatthefar.data.model.weather

import com.google.gson.annotations.SerializedName

data class MainData(
        @SerializedName("temp")
        val temp: Double,
        @SerializedName("pressure")
        val pressure: Int,
        @SerializedName("humidity")
        val humidity: Int,
        @SerializedName("temp_min")
        val tempMin: Double,
        @SerializedName("temp_max")
        val tempMax: Double
)