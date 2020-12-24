package com.example.data.api

import com.example.data.entity.*
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface Service {

    @GET("/Cast/")
    fun getCastModel(): Single<Cast>
    @GET("/Data/")
    fun getDataModel(): Single<Data>
    @GET("/Details/")
    fun getDetailsModel(): Single<Details>
    @GET("/Genre/")
    fun getGenreModel(): Single<Genre>
    @GET("/Movie/")
    fun getMovieModel(): Single<Movie>
    @GET("/Season/")
    fun getSeasonModel(): Single<Season>

}