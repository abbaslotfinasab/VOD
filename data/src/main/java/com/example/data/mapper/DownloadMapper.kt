package com.example.data.mapper

import com.example.data.entity.Download
import com.example.domain.model.DownloadModel
import javax.inject.Inject

class DownloadMapper @Inject constructor() {

    fun toMapper (download:Download) :DownloadModel {
        return DownloadModel(

            download.id?:0,
            download.title?:"",
            download.path?:"",
            download.type?:"",
            download.size?:0

        )
    }
}