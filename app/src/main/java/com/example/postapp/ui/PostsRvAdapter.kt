package com.example.postapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.postapp.R
import com.example.postapp.models.Post
import java.text.FieldPosition

class PostsRvAdapter(
    RecyclerView.Adapter<PostsRvAdapter.PostsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : PostsViewHolder{
        var itemview =
            LayoutInflater.from(parent.context).inflate(R.layout.row_post_item,parent, attachToRo)
        return PostsViewHolder(itemview)
      }

    override fun onBindViewHolder( holder: PostsViewHolder, position: Int) {
        var posts = postsList[position]
        holder.rowView.tvTitle.text = post.title
        holder.rowView.tvBody.text = post.body
        holder.rowView.tvUserId.text = post.userId.toString()

      }

      override fun getItemCount(): Int {
          return postsList.Size
      }
      class PostsViewHolder(val rowView: View): RecyclerView.ViewHolder(rowView)

}

