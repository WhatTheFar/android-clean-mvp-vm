package com.whatthefar.presentation.model

data class WeatherItem(
        val name: String,
        val averageTemp: Double
) {
    val text: String by lazy {
        "$name : $averageTemp"
    }
}