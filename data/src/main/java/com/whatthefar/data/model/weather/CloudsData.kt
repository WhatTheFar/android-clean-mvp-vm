package com.whatthefar.data.model.weather

import com.google.gson.annotations.SerializedName

data class CloudsData(
        @SerializedName("all")
        val all: Int
)