package com.example.oppa.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.domain.model.MovieModel
import com.example.oppa.R
import com.example.oppa.ui.adapter.RecyclerViewItemDataAdapter
import kotlinx.android.synthetic.main.activity_more.*


class MoreActivity : AppCompatActivity() {

    private val movieModel:ArrayList<MovieModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

        val actionBar = supportActionBar
        val category :String?=intent.getStringExtra("category")
      //val id :Int=intent.getIntExtra("id",0)
        actionBar!!.title =category
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL

        createDummyData()

        more_recycler_view.apply {

            layoutManager = GridLayoutManager(context,3)

            adapter = RecyclerViewItemDataAdapter(movieModel)
        }
    }

    private fun  createDummyData() {

        for (i in 0..20){

            val mm = MovieModel(0,""+i,""+i, emptyList())

            movieModel.add(mm)


        }

    }

}
