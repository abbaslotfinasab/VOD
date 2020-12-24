package com.example.domain.repository

import com.example.domain.model.GenreModel
import io.reactivex.rxjava3.core.Single

interface GenreRepo {

    fun getGenre() : Single<GenreModel>

}