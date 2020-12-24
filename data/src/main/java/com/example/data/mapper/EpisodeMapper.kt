package com.example.data.mapper

import com.example.data.entity.Episode
import com.example.domain.model.EpisodeModel
import javax.inject.Inject

class EpisodeMapper @Inject constructor() {
    fun toMapper(episode:Episode):EpisodeModel{
        return EpisodeModel(

            episode.id?:0,
            episode.title?:"",
            episode.duration?:0,
            episode.downloadModel?: emptyList(),
            episode.videoModel?: emptyList()




        )
    }
}