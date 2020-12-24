package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.DetailsMapper
import com.example.domain.model.DetailsModel
import com.example.domain.repository.DetailsRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class DetailsRepoImpl @Inject constructor(private val service: Service , private val detailsMapper: dagger.Lazy<DetailsMapper>) : DetailsRepo {

    override fun getDetails(): Single<DetailsModel> {
        return service.getDetails().map {
            detailsMapper.get().toMapper(it)
        }

    }
}