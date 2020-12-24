package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.SubtitleMapper
import com.example.domain.model.SubtitleModel
import com.example.domain.repository.SubtitleRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SubtitleRepoImpl @Inject constructor(private val service: Service, private val subtitleMapper: dagger.Lazy<SubtitleMapper>) :
    SubtitleRepo {

    override fun getSubtitle() : Single<SubtitleModel> {
        return service.getSubtitle().map {
            subtitleMapper.get().toMapper(it)
        }

    }
}