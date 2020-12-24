package com.example.domain.repository

import com.example.domain.model.CastModel
import com.example.domain.model.SubtitleModel
import io.reactivex.rxjava3.core.Single

interface SubtitleRepo {

    fun getSubtitle() : Single<SubtitleModel>

}