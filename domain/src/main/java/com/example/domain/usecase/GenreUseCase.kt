package com.example.domain.usecase

import com.example.domain.model.GenreModel
import io.reactivex.rxjava3.core.Single

interface GenreUseCase<R> {

    fun execute() : Single<GenreModel>
}