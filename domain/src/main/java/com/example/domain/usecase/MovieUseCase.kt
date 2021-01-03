package com.example.domain.usecase


import io.reactivex.rxjava3.core.Single

interface MovieUseCase<R> {

    fun execute() : Single<R>
}