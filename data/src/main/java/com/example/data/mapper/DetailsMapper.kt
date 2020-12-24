package com.example.data.mapper

import com.example.data.entity.Details
import com.example.domain.model.DetailsModel
import javax.inject.Inject

class DetailsMapper @Inject constructor() {

    fun toMapper(details: Details): DetailsModel {

        return DetailsModel(

            details.id?:0,
            details.description ?: "",
            details.description ?: "",
            details.rate ?: 0,
            details.view ?: 0,
            details.like ?: 0,
            details.year?: 0,
            details.time?: 0,
            details.number?: 0,
            details.genre?: "",
            details.day?: "",
            details.channel?: "",
            details.director?: "",
            details.country?: "",
            details.comment?: emptyList(),
            details.season?: emptyList(),
            details.cast?: emptyList()


        )
    }
}