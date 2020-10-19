package com.example.demo_review.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_review.R
import com.example.demo_review.bean.Article
import kotlinx.android.synthetic.main.item_article.view.*

class ArticleAdapter(val context:Context,val list:List<Article>): RecyclerView.Adapter<ArticleAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=  LayoutInflater.from(context).inflate(R.layout.item_article,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tv.text=list[position].title
    }

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

    }
}