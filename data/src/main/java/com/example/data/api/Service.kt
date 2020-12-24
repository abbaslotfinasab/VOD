package com.example.data.api

import com.example.data.entity.*
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface Service {

    @GET("/Cast/")
    fun getCast(): Single<Cast>
    @GET("/Comment/")
    fun getComment(): Single<Comment>
    @GET("/Data/")
    fun getData(): Single<Data>
    @GET("/Details/")
    fun getDetails(): Single<Details>
    @GET("/Download/")
    fun getDownload(): Single<Download>
    @GET("/Movie/")
    fun getMovie(): Single<Movie>
    @GET("/Episode/")
    fun getEpisode(): Single<Episode>
    @GET("/Season/")
    fun getSeason(): Single<Season>
    @GET("/Subtitle/")
    fun getSubtitle(): Single<Subtitle>
    @GET("/Video/")
    fun getVideo(): Single<Video>

}