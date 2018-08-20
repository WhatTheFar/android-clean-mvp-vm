package com.whatthefar.data.api

import com.whatthefar.data.model.weather.WeatherResponseData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapService {

    @GET("weather")
    fun getWeather(
            @Query("q") cityName: String,
            @Query(API_KEY_QUERY) apiKey: String
    ): Observable<WeatherResponseData>

    companion object {
        const val API_KEY_QUERY = "appid"
    }
}