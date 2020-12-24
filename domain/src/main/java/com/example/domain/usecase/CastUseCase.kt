package com.example.domain.usecase

import com.example.domain.model.CastModel
import io.reactivex.rxjava3.core.Single

interface CastUseCase<R> {

    fun execute() : Single<CastModel>
}