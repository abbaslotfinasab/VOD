package com.example.domain.usecase

import com.example.domain.model.CommentModel
import com.example.domain.repository.CommentRepo
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class CommentUseCasImpl  @Inject constructor(private val commentRepo: CommentRepo) : CommentUseCase<CommentModel> {

    override fun execute(): Single<CommentModel> {
        return commentRepo.getComment()
    }
}