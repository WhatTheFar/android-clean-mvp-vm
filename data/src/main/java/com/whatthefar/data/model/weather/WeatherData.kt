package com.whatthefar.data.model.weather

data class WeatherData(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)