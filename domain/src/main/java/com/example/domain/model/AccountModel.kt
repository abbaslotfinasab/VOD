package com.example.domain.model

import java.util.*

data class AccountModel (

    var id : Int?=0,
    var firstname:String?=null,
    var lastname:String?=null,
    var user: String?=null,
    var password :String?=null,
    var photo : String?=null,
    var email:String?=null,
    var phonenumber:Int?=0,
    var birthday:Date?=null


)
