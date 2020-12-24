package com.example.domain.usecase

import com.example.domain.model.CastModel
import com.example.domain.model.CommentModel
import io.reactivex.rxjava3.core.Single

interface CommentUseCase<R> {

    fun execute() : Single<CommentModel>

}