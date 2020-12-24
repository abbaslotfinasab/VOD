package com.example.domain.usecase

import com.example.domain.model.DownloadModel
import io.reactivex.rxjava3.core.Single

interface DownloadUseCase<R> {

    fun execute() : Single<DownloadModel>

}