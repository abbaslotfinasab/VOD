package com.example.domain.model

data class CommentModel(

    var id :Int?=0,
    var user:String?=null,
    var content:String?=null,
    var created:String?=null,
    var enabled:Boolean?=true

)
