package com.example.domain.usecase

import com.example.domain.model.MovieModel
import com.example.domain.repository.MovieRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class MovieUseCaseImpl @Inject constructor(private val movieRepo: MovieRepo) : MovieUseCase<MovieModel> {

    override fun execute(): Single<MovieModel> {
        return movieRepo.getMovie()
    }
}