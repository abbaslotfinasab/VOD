package com.example.domain.usecase

import com.example.domain.model.DownloadModel
import com.example.domain.repository.DownloadRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class DownloadUseCaseImpl @Inject constructor(private val downloadRepo: DownloadRepo) : DownloadUseCase<DownloadModel> {

    override fun execute(): Single<DownloadModel> {
        return downloadRepo.getDownload()
    }
}