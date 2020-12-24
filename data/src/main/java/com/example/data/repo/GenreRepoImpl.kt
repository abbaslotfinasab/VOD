package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.GenreMapper
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GenreRepoImpl @Inject constructor(private val service: Service , private val genreMapper: dagger.Lazy<GenreMapper>) : GenreRepo {

    override fun getGenre(): Single<GenreModel> {
        return service.getGenreModel().map {
            genreMapper.get().toMapper(it)

        }
    }
}