package com.example.domain.usecase

import com.example.domain.model.DataModel
import io.reactivex.rxjava3.core.Single

interface DataUseCase<R> {

    fun execute() : Single<DataModel>

}