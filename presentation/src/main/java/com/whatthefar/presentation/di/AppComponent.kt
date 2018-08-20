package com.whatthefar.presentation.di

import android.app.Application
import com.whatthefar.presentation.App
import com.whatthefar.presentation.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBuildersModule::class,
    RepositoryModule::class,
    UseCaseModule::class,
    NetworkModule::class,
    ViewModelModule::class])
interface AppComponent {

    fun inject(app: App)

    @Component.Builder
    interface Builder : ComponentBuilder<AppComponent> {

        /**
         * will allow clients of this builder to pass their own instances,
         * and those instances can be injected within the component
         */
        @BindsInstance
        fun application(application: Application): Builder
    }
}