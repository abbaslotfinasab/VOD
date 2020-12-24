package com.example.domain.repository

import com.example.domain.model.DataModel
import io.reactivex.rxjava3.core.Single

interface DataRepo {

    fun getData() : Single<DataModel>
}