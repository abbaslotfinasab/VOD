package com.example.domain.repository


import com.example.domain.model.CommentModel
import io.reactivex.rxjava3.core.Single

interface CommentRepo {

    fun getComment() : Single<CommentModel>

}