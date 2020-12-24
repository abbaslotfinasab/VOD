package com.example.data.mapper

import com.example.data.entity.Cast
import com.example.domain.model.CastModel
import javax.inject.Inject

class CastMapper @Inject constructor() {

    fun toMapper (cast:Cast) : CastModel {
        return CastModel(

            cast.id ?:0,
            cast.actor?: "",
            cast.director ?: "",
            cast.photo ?: "",
            cast.role?:""
        )

    }

}