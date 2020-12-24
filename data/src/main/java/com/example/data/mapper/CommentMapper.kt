package com.example.data.mapper

import com.example.data.entity.Comment
import com.example.domain.model.CommentModel
import javax.inject.Inject

class CommentMapper @Inject constructor() {

    fun toMapper (comment: Comment) : CommentModel {
        return CommentModel(

            comment.id ?:0,
            comment.user?: "",
            comment.photo ?: "",
            comment.content ?: "",
            comment.date ?:0,
            comment.like ?: 0,
            comment.dislike ?: 0

        )

    }

}