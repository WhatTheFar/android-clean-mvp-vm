package com.whatthefar.presentation.ui.main.di

import com.whatthefar.presentation.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBinder {

    @ContributesAndroidInjector()
    abstract fun bindMainFragment(): MainFragment
}