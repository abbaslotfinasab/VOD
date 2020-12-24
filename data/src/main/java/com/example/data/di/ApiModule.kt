package com.example.data.di

import com.example.data.api.Service
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    fun bindApiService(retrofit: Retrofit): Service {
        return retrofit.create(Service::class.java)
    }

}