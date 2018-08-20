package com.whatthefar.data.model.weather

import com.google.gson.annotations.SerializedName

data class WeatherResponseData(
        @SerializedName("coord")
        val coordinate: CoordinateData,
        @SerializedName("weather")
        val weather: List<WeatherData>,
        @SerializedName("base")
        val base: String,
        @SerializedName("main")
        val main: MainData,
        @SerializedName("visibility")
        val visibility: Int,
        @SerializedName("wind")
        val wind: WindData,
        @SerializedName("clouds")
        val clouds: CloudsData,
        @SerializedName("dt")
        val dt: Int,
        @SerializedName("sys")
        val sys: SysData,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("cod")
        val cod: Int
)