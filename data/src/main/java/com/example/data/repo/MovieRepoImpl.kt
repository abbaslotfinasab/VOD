package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.MovieMapper
import com.example.domain.model.MovieModel
import com.example.domain.repository.MovieRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class MovieRepoImpl @Inject constructor(private val service: Service ,private val movieMapper: dagger.Lazy<MovieMapper>) : MovieRepo {

    override fun getMovie(): Single<MovieModel> {
        return service.getMovieModel().map {
            movieMapper.get().toMapper(it)
        }
    }
}