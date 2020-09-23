package com.example.postapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.postapp.repository.PostsRepository


class PostsViewModelFactory(private val postsRepository: PostsRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostsViewModel::class.java)){
            return PostsViewModel(postsRepository) as T
        }
        throw IllegalArgumentException("Unknown Viewmodel class")
    }
}

