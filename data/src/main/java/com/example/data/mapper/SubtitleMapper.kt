package com.example.data.mapper

import com.example.data.entity.Subtitle
import com.example.domain.model.SubtitleModel
import javax.inject.Inject

class SubtitleMapper @Inject constructor() {
    fun toMapper (subtitle:Subtitle): SubtitleModel{
        return SubtitleModel(

            subtitle.id?:0,
            subtitle.url?:"",
            subtitle.type?:"",
            subtitle.language?:""





        )
    }
}