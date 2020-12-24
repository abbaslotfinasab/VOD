package com.example.domain.model

data class DetailsModel (

    var id:Int?=0,
    val background:String?=null,
    var description:String?=null,
    var rate :Int?=0,
    var view: Int?=0,
    var like: Int?=0,
    var year: Int?=0,
    var time: Int?=0,
    var number :Int?=0,
    var genre: String?=null,
    var day:String?=null,
    var channel:String?=null,
    var director:String?=null,
    var county:String?=null,
    var commentModel: List<CommentModel>,
    var season:List<SeasonModel>?,
    var castModel:List<CastModel>?

)
