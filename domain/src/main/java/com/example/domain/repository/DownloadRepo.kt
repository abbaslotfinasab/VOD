package com.example.domain.repository

import com.example.domain.model.CastModel
import com.example.domain.model.DownloadModel
import io.reactivex.rxjava3.core.Single

interface DownloadRepo {

    fun getDownload() : Single<DownloadModel>

}