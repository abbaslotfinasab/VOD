package com.example.data.mapper

import com.example.data.entity.Video
import com.example.domain.model.VideoModel
import javax.inject.Inject

class VideoMapper @Inject constructor() {
    fun toMapper (video:Video):VideoModel{
        return VideoModel(

            video.id?:0,
            video.url?:"",
            video.subtitle?: emptyList()







        )
    }

}