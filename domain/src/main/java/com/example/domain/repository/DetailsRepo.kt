package com.example.domain.repository

import com.example.domain.model.DetailsModel
import io.reactivex.rxjava3.core.Single

interface DetailsRepo {

    fun getDetails() : Single<DetailsModel>
}