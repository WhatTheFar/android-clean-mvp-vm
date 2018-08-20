package com.whatthefar.presentation.di.module


import com.whatthefar.presentation.ui.main.MainActivity
import com.whatthefar.presentation.ui.main.di.MainActivityAbstractModule
import com.whatthefar.presentation.ui.main.di.MainActivityModule
import com.whatthefar.presentation.ui.main.di.MainFragmentBinder
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [
        MainActivityModule::class,
        MainActivityAbstractModule::class,
        MainFragmentBinder::class])
    abstract fun bindMainActivity(): MainActivity

}