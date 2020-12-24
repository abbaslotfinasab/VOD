package com.example.domain.repository

import com.example.domain.model.EpisodeModel
import io.reactivex.rxjava3.core.Single

interface EpisodeRepo {

    fun getEpisode() : Single<EpisodeModel>
}