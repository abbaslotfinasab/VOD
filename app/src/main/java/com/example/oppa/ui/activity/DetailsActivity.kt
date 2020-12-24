package com.example.oppa.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.oppa.R

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val actionBar = supportActionBar
        val name :String?=intent.getStringExtra("name")
        val id :Int=intent.getIntExtra("id",0)
        actionBar!!.title =name
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
    }
}