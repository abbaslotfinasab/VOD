package com.example.domain.model

import java.util.*

data class CommentModel(

    var id :Int?=0,
    var user:String?=null,
    var photo:String?=null,
    var content:String?=null,
    var date:Int?=0,
    var like:Int?=0,
    var dislike:Int?=0

)
