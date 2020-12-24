package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.VideoMapper
import com.example.domain.model.VideoModel
import com.example.domain.repository.VideoRepo
import io.reactivex.rxjava3.core.Single

class VideoRepoImpl constructor(private val service: Service, private val videoMapper: dagger.Lazy<VideoMapper>) :
    VideoRepo {

    override fun getVideo() : Single<VideoModel> {
        return service.getVideo().map {
            videoMapper.get().toMapper(it)
        }

    }
}