package com.example.domain.usecase

import com.example.domain.model.DataModel
import com.example.domain.repository.DataRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class DataUseCaseImpl @Inject constructor(private val dataRepo: DataRepo) : DataUseCase<DataModel> {

    override fun execute(): Single<DataModel> {
        return dataRepo.getData()
    }
}