package com.shubham.uidesign.adapter.horizontal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shubham.uidesign.R
import com.shubham.uidesign.model.Data
import com.squareup.picasso.Picasso

class PodcastAapter(private val list: ArrayList<Data>) :
    RecyclerView.Adapter<PodcastAapter.MyView>() {
    class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.podcast_image)
        var textView: TextView = view.findViewById(R.id.podcast_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_podcast,
                parent,
                false
            )
        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        val listData = list[position]

        //Loading Image into view
        Picasso.get().load(listData.imageUrl).placeholder(R.mipmap.ic_launcher)
            .into(holder.imageView)
        holder.textView.text = listData.title

    }

    override fun getItemCount(): Int {
        return list.size
    }

}