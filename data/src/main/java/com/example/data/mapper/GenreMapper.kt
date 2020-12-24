package com.example.data.mapper

import com.example.data.entity.Genre
import javax.inject.Inject

class GenreMapper @Inject constructor() {

    fun toMapper(genre: Genre): GenreModel {

        return GenreModel(
            genre.id ?: 0,
            genre.name ?: ""
        )
    }
}