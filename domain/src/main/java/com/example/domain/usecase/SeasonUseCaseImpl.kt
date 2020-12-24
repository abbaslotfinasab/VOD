package com.example.domain.usecase

import com.example.domain.model.SeasonModel
import com.example.domain.repository.SeasonRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SeasonUseCaseImpl @Inject constructor(private val seasonRepo: SeasonRepo) : SeasonUseCase<SeasonModel> {

    override fun execute(): Single<SeasonModel> {
        return seasonRepo.getSeason()
    }
}