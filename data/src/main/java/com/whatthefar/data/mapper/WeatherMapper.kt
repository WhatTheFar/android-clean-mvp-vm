package com.whatthefar.data.mapper

import com.whatthefar.data.model.weather.WeatherResponseData
import com.whatthefar.domain.model.Weather
import javax.inject.Inject

class WeatherMapper
@Inject constructor() {

    fun mapToDomain(weatherResponseData: WeatherResponseData) =
            with(weatherResponseData) {
                Weather(
                        name = name,
                        temp = main.temp,
                        tempMin = main.tempMin,
                        tempMax = main.tempMax
                )
            }
}