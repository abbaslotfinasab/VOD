package com.example.domain.usecase


import com.example.domain.model.MovieModel
import io.reactivex.rxjava3.core.Single

interface MovieUseCase<R> {

    fun execute() : Single<MovieModel>
}