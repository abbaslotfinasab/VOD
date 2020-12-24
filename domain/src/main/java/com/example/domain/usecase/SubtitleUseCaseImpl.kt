package com.example.domain.usecase

import com.example.domain.model.CastModel
import com.example.domain.model.SubtitleModel
import com.example.domain.repository.CastRepo
import com.example.domain.repository.SubtitleRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SubtitleUseCaseImpl  @Inject constructor(private val subtitleRepo: SubtitleRepo) : SubtitleUseCase<SubtitleModel> {

    override fun execute(): Single<SubtitleModel> {
        return subtitleRepo.getSubtitle()
    }
}