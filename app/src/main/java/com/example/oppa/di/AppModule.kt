package com.example.oppa.di

import android.app.Application
import android.content.Context
import com.example.oppa.rx.SchedulersFacade
import com.example.oppa.rx.SchedulersProvider
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context

    @Binds
    abstract fun providerScheduler(schedulersFacade: SchedulersFacade): SchedulersProvider
}