package com.example.oppa.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domain.model.DataModel
import com.example.domain.model.MovieModel
import com.example.oppa.R
import com.example.oppa.ui.adapter.RecyclerViewDataAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private  val dataModel:ArrayList<DataModel> = ArrayList()
    private lateinit var movieModel:ArrayList<MovieModel>
    private val  arrayList = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
         inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arrayList.add("")
        arrayList.add("سریال های اینده")
        arrayList.add("سریال های درحال پخش")
        arrayList.add("سریال های برتر")
        arrayList.add("سریال های پرمخاطب")
        arrayList.add("سریال های پیشنهادی")
        arrayList.add("فیلم ها")

        createDummyData()

        my_recycler_view.apply {

            layoutManager = LinearLayoutManager(activity)

            adapter = RecyclerViewDataAdapter(dataModel,movieModel)
        }
    }

     private fun  createDummyData() {

         for (i in 0..6){
             movieModel=ArrayList()
             val dm = DataModel(0, arrayList[i], emptyList())
             for (j in 0.. 5){
                 val mm = MovieModel(0,""+j,""+j, emptyList())
                 movieModel.add(mm)
             }
             dataModel.add(dm)

         }
     }

}
