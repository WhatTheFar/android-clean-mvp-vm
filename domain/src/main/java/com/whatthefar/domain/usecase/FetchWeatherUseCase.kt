package com.whatthefar.domain.usecase

import com.whatthefar.domain.model.Weather
import com.whatthefar.domain.repository.WeatherRepository
import io.reactivex.Observable


class FetchWeatherUseCase(
        private val weatherRepository: WeatherRepository,
        private val apiKey: String
) {

    fun execute(cityName: String): Observable<Weather> =
            weatherRepository.getWeather(cityName, apiKey)

}