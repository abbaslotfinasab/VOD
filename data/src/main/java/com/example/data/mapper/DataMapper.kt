package com.example.data.mapper

import com.example.data.entity.Data
import com.example.domain.model.DataModel
import javax.inject.Inject

class DataMapper @Inject constructor() {

    fun toMapper(data: Data): DataModel {

        return DataModel(

            data.id?:0,
            data.category?:"",
            data.movie?: emptyList()
        )
    }
}