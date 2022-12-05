package com.example.rectrofitapiusingmvvm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapiusingmvvm.Rectrofit.PostList
import com.example.rectrofitapiusingmvvm.databinding.PostCustomViewBinding

class PostRecyclerViewAdapter(private val postList: PostList): RecyclerView.Adapter<PostRecyclerViewAdapter.PostViewHolder>() {

    inner class PostViewHolder( var postCustomViewBinding: PostCustomViewBinding): RecyclerView.ViewHolder(postCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_custom_view, parent, false)

        return PostViewHolder(PostCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//        val post = postList[position]
        holder.postCustomViewBinding.tvUserId.text = postList.get(position).UserId.toString()
        holder.postCustomViewBinding.tvTitle.text = postList.get(position).title
    }

    override fun getItemCount(): Int {
        return postList.size
    }

}