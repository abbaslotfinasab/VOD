package com.example.domain.usecase

import com.example.domain.model.SubtitleModel
import io.reactivex.rxjava3.core.Single

interface SubtitleUseCase<R> {

    fun execute() : Single<SubtitleModel>

}