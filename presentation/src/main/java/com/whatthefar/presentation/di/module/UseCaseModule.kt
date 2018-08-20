package com.whatthefar.presentation.di.module

import com.whatthefar.domain.repository.WeatherRepository
import com.whatthefar.domain.usecase.FetchWeatherUseCase
import com.whatthefar.presentation.BuildConfig
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    internal fun provideFetchWeatherUseCase(weatherRepository: WeatherRepository): FetchWeatherUseCase =
            FetchWeatherUseCase(
                    weatherRepository,
                    BuildConfig.OPEN_WEATHER_API_KEY
            )
}