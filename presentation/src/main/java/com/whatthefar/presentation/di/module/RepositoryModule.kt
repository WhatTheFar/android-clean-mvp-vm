package com.whatthefar.presentation.di.module

import com.whatthefar.data.repository.WeatherRepositoryImpl
import com.whatthefar.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    internal abstract fun bindWeatherRepository(weatherRepository: WeatherRepositoryImpl): WeatherRepository
}