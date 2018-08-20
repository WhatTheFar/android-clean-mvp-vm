package com.whatthefar.domain.repository

import com.whatthefar.domain.model.Weather
import io.reactivex.Observable

interface WeatherRepository {

    fun getWeather(cityName: String, apiKey: String): Observable<Weather>
}