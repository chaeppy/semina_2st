package com.example.soptwebtoon

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.lang.Exception

class WebtoonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img = itemView.findViewById<ImageView>(R.id.img)
    val name = itemView.findViewById<TextView>(R.id.name)
    val star = itemView.findViewById<TextView>(R.id.star)
    val author = itemView.findViewById<TextView>(R.id.author)

    fun bind(webtoonData: WebtoonData ) {
        name.text = webtoonData.name
        star.text = webtoonData.star
        author.text = webtoonData.author
        img.setImageResource(webtoonData.img_contents)
        /*try {
            Glide.with(itemView).load(webtoonData.img_contents).into(img)
        }catch(e :Exception){
            Log.e("d","hahaha")
        }*/
    }
}
