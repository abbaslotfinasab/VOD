package com.example.domain.usecase

import com.example.domain.model.GenreModel
import com.example.domain.repository.GenreRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GenreUseCaseImpl @Inject constructor(private val genreRepo: GenreRepo) : GenreUseCase<GenreModel> {

    override fun execute(): Single<GenreModel> {
        return genreRepo.getGenre()
    }
}