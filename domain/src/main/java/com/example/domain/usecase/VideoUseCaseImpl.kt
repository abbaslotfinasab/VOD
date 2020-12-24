package com.example.domain.usecase

import com.example.domain.model.VideoModel
import com.example.domain.repository.VideoRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class VideoUseCaseImpl  @Inject constructor(private val videoRepo: VideoRepo) : VideoUseCase<VideoModel> {

    override fun execute(): Single<VideoModel> {
        return videoRepo.getVideo()
    }
}