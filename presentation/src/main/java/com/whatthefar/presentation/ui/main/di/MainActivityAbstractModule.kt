package com.whatthefar.presentation.ui.main.di

import com.whatthefar.presentation.ui.main.MainContract
import com.whatthefar.presentation.ui.main.MainPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityAbstractModule {

    @Binds
    internal abstract fun bindMainPresenter(mainPresenter: MainPresenter): MainContract.Presenter
}