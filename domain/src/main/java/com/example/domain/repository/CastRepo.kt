package com.example.domain.repository

import com.example.domain.model.CastModel
import io.reactivex.rxjava3.core.Single

interface CastRepo {

    fun getCast() : Single<CastModel>

}