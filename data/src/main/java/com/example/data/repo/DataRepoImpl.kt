package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.DataMapper
import com.example.domain.model.DataModel
import com.example.domain.repository.DataRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class DataRepoImpl @Inject constructor(private val service: Service ,private val dataMapper: dagger.Lazy<DataMapper>  ):DataRepo {

    override fun getData() : Single<DataModel>{
        return service.getDataModel().map {
            dataMapper.get().toMapper(it)
        }
    }
}