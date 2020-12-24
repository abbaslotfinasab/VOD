package com.example.oppa.di

import com.example.oppa.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelModule::class])
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainScreenActivity(): MainActivity

}