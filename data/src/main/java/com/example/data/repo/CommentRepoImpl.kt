package com.example.data.repo

import com.example.data.api.Service
import com.example.data.mapper.CommentMapper
import com.example.domain.model.CommentModel
import com.example.domain.repository.CommentRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class CommentRepoImpl @Inject constructor (private val service: Service, private val commentMapper: dagger.Lazy<CommentMapper>):CommentRepo {

    override fun getComment() : Single<CommentModel> {
        return service.getComment().map {
            commentMapper.get().toMapper(it)
        }

    }
}