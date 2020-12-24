package com.example.data.mapper

import com.example.data.entity.Season
import com.example.domain.model.SeasonModel
import javax.inject.Inject

class SeasonMapper @Inject constructor() {

    fun toMapper(season: Season): SeasonModel {

        return SeasonModel(
            season.id ?:0,
            season.title ?: "",
            season.episode ?: emptyList()
        )
    }
}