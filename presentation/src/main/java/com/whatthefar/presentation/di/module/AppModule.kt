package com.whatthefar.presentation.di.module

import android.app.Application
import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.whatthefar.presentation.network.AppScheduler
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton


@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    @Provides
    fun provideGson(): Gson = GsonBuilder()
//            .excludeFieldsWithoutExposeAnnotation()
            .create()

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    fun provideAppScheduler(): AppScheduler = AppScheduler()
}