package com.example.postapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.postapp.repository.PostsRepository
import com.example.postapp.viewModel.PostsViewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main
            postsViewModelFactory = PostsViewModelFactory(PostsRepository())
            postsViewModel =
                ViewModelProvider( this, postsViewModelFactory).get(PostsViewModel::class.java)

        postsViewModel.getDbPosts()

        postsViewModel.postsLiveData.observe( owner:this, Observer { posts ->
            if (posts.isEmpty()){

            }
            else{
                val postsAdapter = PostsRvAdapter(posts)
                rvPosts.apply{
                    layoutManager = LinearLayoutManager(baseContext)
                    adapter = postsAdapter
                }
            }
        })

        postsViewModel.postsFailedLiveData.observe( this, { error ->
            Toast.makeText(baseContext,error, Toast.LENGTH_LONG).show(

        })

    }
}