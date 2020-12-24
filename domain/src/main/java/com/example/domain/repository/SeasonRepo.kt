package com.example.domain.repository

import com.example.domain.model.SeasonModel
import io.reactivex.rxjava3.core.Single

interface SeasonRepo {

    fun getSeason() : Single<SeasonModel>
}