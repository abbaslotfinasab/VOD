package com.example.domain.usecase


import com.example.domain.model.SeasonModel
import io.reactivex.rxjava3.core.Single

interface SeasonUseCase<R> {

    fun execute() : Single<SeasonModel>
}