package com.shubham.uidesign.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.shubham.uidesign.R
import com.shubham.uidesign.adapter.horizontal.*
import com.shubham.uidesign.model.Data
import kotlinx.android.synthetic.main.fragment_home_hub.*

class HomeHub : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home_hub, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        compassion_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        blogs_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        video_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        stories_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        prayers_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        news_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        instagram_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        podcast_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )
        radio_recycler.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL, false
        )


        val data: ArrayList<Data> = arrayListOf()
        var data1 = Data(
            "Train at Home",
            "https://www.unicef.org/southafrica/sites/unicef.org.southafrica/files/styles/hero_mobile/public/ZAF-UNI174417.jpg?itok=HTB-BqMG"
        )
        var data2 = Data(
            "Meet Doctor Jennifer Alvarado",
            "https://tsc.nyc/files/Give-Story-October-Newsletter.jpg"
        )
        var data3 = Data(
            "Prayer Resources ",
            "https://www.unicef.org/southafrica/sites/unicef.org.southafrica/files/styles/hero_mobile/public/ZAF-BEC5433.jpg?itok=r1Sgu9k9"
        )
        var data4 = Data(
            "Prayer Resources Train at Home",
            "https://www.gavi.org/sites/default/files/thumbnail/RS19523_Tony-Noel_bn_h2.jpg"
        )



        data.add(data1)
        data.add(data2)
        data.add(data3)
        data.add(data4)


        //setting adapter to recycler
        blogs_recycler.adapter = VideoAdapter(data)
        video_recycler.adapter = VideoAdapter(data)
        stories_recycler.adapter = VideoAdapter(data)
        prayers_recycler.adapter = VideoAdapter(data)
        news_recycler.adapter = VideoAdapter(data)
        compassion_recycler.adapter = CompassionAdapter(data)
        instagram_recycler.adapter = InstagramAdapter(data)
        podcast_recycler.adapter = PodcastAapter(data)
        radio_recycler.adapter = RadioAdapter(data)
    }

}