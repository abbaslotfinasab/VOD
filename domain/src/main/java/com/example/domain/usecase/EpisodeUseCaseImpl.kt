package com.example.domain.usecase

import com.example.domain.model.EpisodeModel
import com.example.domain.repository.EpisodeRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class EpisodeUseCaseImpl  @Inject constructor(private val episodeRepo: EpisodeRepo) : EpisodeUseCase<EpisodeModel> {

    override fun execute(): Single<EpisodeModel> {
        return episodeRepo.getEpisode()
    }
}