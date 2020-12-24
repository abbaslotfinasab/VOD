package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.DownloadMapper
import com.example.domain.model.DownloadModel
import com.example.domain.repository.DownloadRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class DownloadRepoImpl @Inject constructor(private val service: Service, private val downloadMapper: dagger.Lazy<DownloadMapper>) :
    DownloadRepo {

    override fun getDownload() : Single<DownloadModel> {
        return service.getDownload().map {
            downloadMapper.get().toMapper(it)
        }

    }
}