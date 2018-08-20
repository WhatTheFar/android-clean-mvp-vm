package com.whatthefar.data.repository

import com.iseinc.data.cache.CacheTransformer
import com.whatthefar.data.api.OpenWeatherMapService
import com.whatthefar.data.mapper.WeatherMapper
import com.whatthefar.domain.model.Weather
import com.whatthefar.domain.repository.WeatherRepository
import io.reactivex.Observable
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class WeatherRepositoryImpl
@Inject constructor(
        private val openWeatherMapService: OpenWeatherMapService,
        private val weatherMapper: WeatherMapper
) : WeatherRepository {

    override fun getWeather(cityName: String, apiKey: String): Observable<Weather> =
            openWeatherMapService.getWeather(cityName, apiKey)
                    .map(weatherMapper::mapToDomain)
                    .compose(CacheTransformer(60, TimeUnit.SECONDS))
}