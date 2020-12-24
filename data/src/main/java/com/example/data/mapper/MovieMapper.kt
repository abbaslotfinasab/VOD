package com.example.data.mapper

import com.example.data.entity.Movie
import javax.inject.Inject

class MovieMapper @Inject constructor() {

    fun toMapper(movie: Movie): com.example.domain.model.MovieModel {

        return com.example.domain.model.MovieModel(
            movie.id ?:0,
            movie.poster ?: "",
            movie.name ?: "",
            movie.details?: emptyList()
        )
    }
}