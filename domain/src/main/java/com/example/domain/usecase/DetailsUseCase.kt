package com.example.domain.usecase

import com.example.domain.model.DetailsModel
import io.reactivex.rxjava3.core.Single

interface DetailsUseCase<R> {

    fun execute() : Single<DetailsModel>
}