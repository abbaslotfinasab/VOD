package com.example.domain.usecase

import com.example.domain.model.EpisodeModel
import io.reactivex.rxjava3.core.Single

interface EpisodeUseCase<R> {

    fun execute() : Single<EpisodeModel>

}