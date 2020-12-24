package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.CastMapper
import com.example.domain.model.CastModel
import com.example.domain.repository.CastRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class CastRepoImpl @Inject constructor(private val service:Service , private val castMapper: dagger.Lazy<CastMapper>) : CastRepo {

    override fun getCast() : Single<CastModel> {
        return service.getCast().map {
          castMapper.get().toMapper(it)
        }

    }
}