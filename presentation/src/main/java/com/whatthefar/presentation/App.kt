package com.whatthefar.presentation

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.res.Configuration
import com.whatthefar.presentation.di.DaggerAppComponent
import com.whatthefar.presentation.util.LocaleManager
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject


class App : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base?.let(LocaleManager::setLocale))
        Timber.d("attachBaseContext")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        LocaleManager.setLocale(this)
        @Suppress("DEPRECATION")
        Timber.d("onConfigurationChanged: ${newConfig?.locale?.language}")
    }

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }
}