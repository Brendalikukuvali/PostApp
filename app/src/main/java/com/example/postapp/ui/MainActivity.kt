package com.example.postapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.postapp.R
import com.example.postapp.repository.PostsRepository
import com.example.postapp.viewModel.PostsViewModel
import com.example.postapp.viewModel.PostsViewModelFactory


class MainActivity : AppCompatActivity() {

    lateinit var postsViewModel: PostsViewModel
    lateinit var postsViewModelFactory: PostsViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postsViewModelFactory = PostsViewModelFactory(PostsRepository())
        postsViewModel =
            ViewModelProvider(this, postsViewModelFactory).get(PostsViewModel::class.java)

        postsViewModel.getPosts()

        postsViewModel.postsLiveData.observe(owner: this, Observer {
            val postsAdapter = PostsRvAdapter(it)
            rvPosts.apply { this:RecyclerView!
                layoutManager = LinearLayoutManager(baseContext)
                adapter = postsAdapter
            }
        })

}
