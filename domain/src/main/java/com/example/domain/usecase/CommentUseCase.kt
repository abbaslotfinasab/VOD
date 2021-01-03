package com.example.domain.usecase

import io.reactivex.rxjava3.core.Single

interface CommentUseCase<R> {

    fun execute() : Single<R>

}