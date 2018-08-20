package com.whatthefar.presentation.mapper

import com.whatthefar.domain.model.Weather
import com.whatthefar.presentation.model.WeatherItem
import javax.inject.Inject


class WeatherItemMapper
@Inject constructor() {

    fun mapFromDomain(weather: Weather): WeatherItem =
            with(weather) {
                WeatherItem(
                        name = name,
                        averageTemp = (temp + tempMax + tempMax) / 3
                )
            }
}