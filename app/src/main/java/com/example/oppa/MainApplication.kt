package com.example.oppa

import android.content.Context
import androidx.multidex.MultiDex
import com.example.oppa.di.ApplicationComponent
import com.example.oppa.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication:DaggerApplication() {

    private lateinit var appComponent: ApplicationComponent

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerApplicationComponent.builder()
            .application(this)
            .build()
        return appComponent
    }

}
