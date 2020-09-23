package com.example.postapp.viewModel

import androidx.lifecycle.MutableLiveData
import com.example.postapp.models.Post
import com.example.postapp.repository.PostsRepository


class PostViewModel (val postsRepository: PostsRepository:PostsRepository): viewModels(){
    var postliveData =MutableLiveData<List<Post>>()
    var postFailedLiveData = MutableLiveData<String>()

    fun getPosts() {
        val viewModelScope = null
        viewModelScope.launch {
            val response = postsRepository.getPosts()
            val value: Any = if (response.isSuccessfull) {
                val postsLiveData = null.apply {
                    postValue(response.body())
                }
            } else {
                val postsPailedLiveData = null
                postsPailedLiveData.postValue(response.errorBody()?.string())
            }
            value
        }
    }
    fun getDbPosts(){
        postsLiveData = postsRepository.getDbPosts()
    }

    private fun postValue(body: Any) {
        TODO("Not yet implemented")
    }
}

private fun Nothing?.postValue(string: Any) {
    TODO("Not yet implemented")
}

private fun Nothing?.launch(function: () -> Any) {
    TODO("Not yet implemented")
}

open class viewModels {

}
