package com.example.domain.usecase

import com.example.domain.model.CastModel
import com.example.domain.repository.CastRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class CastUseCaseImpl @Inject constructor(private val castRepo: CastRepo) : CastUseCase<CastModel> {

    override fun execute(): Single<CastModel> {
        return castRepo.getCast()
    }
}