package com.whatthefar.data.model.weather

import com.google.gson.annotations.SerializedName

data class CoordinateData(
        @SerializedName("lat")
        val latitude: Double,
        @SerializedName("lon")
        val longitude: Double
)