package com.whatthefar.presentation.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import com.whatthefar.domain.usecase.FetchWeatherUseCase
import com.whatthefar.presentation.mapper.WeatherItemMapper
import com.whatthefar.presentation.model.WeatherItem
import com.whatthefar.presentation.network.AppScheduler
import com.whatthefar.presentation.network.performOnBackOutOnMain
import com.whatthefar.presentation.ui.common.TextWatcherAdapter
import timber.log.Timber
import javax.inject.Inject


class MainPresenter
@Inject constructor(
        private val fetchWeatherUseCase: FetchWeatherUseCase,
        private val weatherItemMapper: WeatherItemMapper,
        private val appScheduler: AppScheduler
) : MainContract.Presenter {

    private lateinit var mViewModel: MainViewModel

    @SuppressLint("CheckResult")
    override fun onInit(savedInstanceState: Bundle?, mainViewModel: MainViewModel) {
        mViewModel = mainViewModel

        if (savedInstanceState == null) {
            mViewModel.onButtonClickListener.value = View.OnClickListener {
                mViewModel.messageText = "Clicked!!!"
            }
            mViewModel.onTextChanged.value = TextWatcherAdapter {
                mViewModel.messageText = it
            }
        }

        fetchWeatherUseCase.execute("bangkok")
                .performOnBackOutOnMain(scheduler = appScheduler)
                .map(weatherItemMapper::mapFromDomain)
                .subscribe(this::receiveWeather, Timber::wtf)
    }

    private fun receiveWeather(weatherItem: WeatherItem) {
        mViewModel.weatherText.value = weatherItem.text
    }
}