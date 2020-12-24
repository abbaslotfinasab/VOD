package com.example.data.mapper

import com.example.data.entity.Details
import com.example.domain.model.DetailsModel
import javax.inject.Inject

class DetailsMapper @Inject constructor() {

    fun toMapper(details: Details): DetailsModel {

        return DetailsModel(

            details.id?:0,
            details.description ?: "",
            details.date ?: "",
            details.duration ?: "",
            details.day ?: "",
            details.channel ?: "",
            details.season?: emptyList(),
            details.genre?: emptyList(),
            details.cast?: emptyList()
        )
    }
}