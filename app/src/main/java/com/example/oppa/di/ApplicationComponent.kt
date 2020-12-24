package com.example.oppa.di

import android.app.Application
import com.example.data.di.ApiModule
import com.example.data.di.NetworkModule
import com.example.oppa.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(

    modules = [
        NetworkModule::class,
        ApiModule::class,
        AppModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        ActivityBindingModule::class
    ]
)

interface ApplicationComponent : AndroidInjector<MainApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

}
