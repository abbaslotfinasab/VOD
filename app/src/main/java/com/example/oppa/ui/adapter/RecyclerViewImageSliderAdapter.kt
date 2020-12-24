package com.example.oppa.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.domain.model.MovieModel
import com.example.oppa.R
import com.example.oppa.ui.activity.DetailsActivity
import kotlinx.android.synthetic.main.slider_single_card.view.*


class RecyclerViewImageSliderAdapter(private val movieModel: List<MovieModel>):
    RecyclerView.Adapter<RecyclerViewImageSliderAdapter.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {

        return position
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int) :ViewHolder {

       val view =  LayoutInflater.from(parent.context).inflate(R.layout.slider_single_card, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int=movieModel.size


    override fun onBindViewHolder(holder:ViewHolder, position: Int) {

        holder.bind(movieModel[position])

    }

    fun ImageView.loadImage(uri: String?) {
        Glide.with(this.context)
            .load(uri)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .error(R.drawable.ic_baseline_person_24)
            .into(this)
    }


    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        private val imageView = itemView.item_Image_slider

        fun bind(movieModel: MovieModel) {

            imageView.loadImage(movieModel.poster)


            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailsActivity::class.java)
                intent.putExtra("name", movieModel.name)
                intent.putExtra("id", movieModel.id)
                itemView.context.startActivity(intent)
            }

        }
    }

}