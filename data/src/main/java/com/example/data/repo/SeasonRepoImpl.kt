package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.SeasonMapper
import com.example.domain.model.SeasonModel
import com.example.domain.repository.SeasonRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class SeasonRepoImpl @Inject constructor(private val service: Service , private val seasonMapper:dagger.Lazy<SeasonMapper>) : SeasonRepo {

    override fun getSeason(): Single<SeasonModel> {
        return service.getSeasonModel().map {
            seasonMapper.get().toMapper(it)
        }
    }
}