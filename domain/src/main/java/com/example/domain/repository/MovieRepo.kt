package com.example.domain.repository

import com.example.domain.model.MovieModel
import io.reactivex.rxjava3.core.Single

interface MovieRepo {

    fun getMovie() : Single<MovieModel>
}