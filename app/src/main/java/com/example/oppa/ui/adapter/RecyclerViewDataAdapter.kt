package com.example.oppa.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.DataModel
import com.example.domain.model.MovieModel
import com.example.oppa.R
import com.example.oppa.ui.activity.MoreActivity
import kotlinx.android.synthetic.main.image_slider.view.*
import kotlinx.android.synthetic.main.list_item.view.*


class RecyclerViewDataAdapter(private val data: List<DataModel>, private val movieModel: List<MovieModel>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {

        return position

    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int):RecyclerView.ViewHolder {
        return if (position == 0) {
            ViewHolder0(LayoutInflater.from(parent.context).inflate(R.layout.image_slider, parent, false))
        } else {
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
        }
    }


    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position==0) {
            (holder as ViewHolder0).bind0()
        }
        else{
            (holder as ViewHolder).bind(data[position])
        }

    }

    inner class ViewHolder0(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val recyclerView = itemView.recycler_image_slider

        fun bind0() {

            recyclerView.apply {

                layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

                adapter = RecyclerViewImageSliderAdapter(movieModel)
            }
            
        }

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val button = itemView.btnMore
        private val recyclerView = itemView.recycler_view_list
        private val textView = itemView.subject

        fun bind (dataModel: DataModel){

            textView.text = dataModel.category

            recyclerView.apply {

                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)

                adapter = RecyclerViewItemDataAdapter(movieModel)
            }

            button.setOnClickListener {
                val intent = Intent(itemView.context,MoreActivity::class.java)
                intent.putExtra("category",dataModel.category)
                intent.putExtra("id",dataModel.id)
                itemView.context.startActivity(intent)

            }
        }

    }

}