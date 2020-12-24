package com.example.domain.repository

import com.example.domain.model.VideoModel
import io.reactivex.rxjava3.core.Single

interface VideoRepo {

    fun getVideo() : Single<VideoModel>

}