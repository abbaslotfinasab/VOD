package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.EpisodeMapper
import com.example.domain.model.EpisodeModel
import com.example.domain.repository.EpisodeRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class EpisodeRepoImpl @Inject constructor(private val service: Service, private val episodeMapper: dagger.Lazy<EpisodeMapper>) :
    EpisodeRepo {

    override fun getEpisode() : Single<EpisodeModel> {
        return service.getEpisode().map {
            episodeMapper.get().toMapper(it)
        }

    }
}