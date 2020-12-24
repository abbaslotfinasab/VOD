package com.example.domain.usecase

import com.example.domain.model.VideoModel
import io.reactivex.rxjava3.core.Single

interface VideoUseCase<R> {

    fun execute() : Single<VideoModel>
}