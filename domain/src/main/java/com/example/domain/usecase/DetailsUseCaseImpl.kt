package com.example.domain.usecase

import com.example.domain.model.DetailsModel
import com.example.domain.repository.DetailsRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class DetailsUseCaseImpl @Inject constructor(private val detailsRepo: DetailsRepo) : DetailsUseCase<DetailsModel> {

    override fun execute(): Single<DetailsModel> {
        return detailsRepo.getDetails()
    }
}