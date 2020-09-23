package com.example.postapp.repository

import com.example.postapp.api.ApiClient
import com.example.postapp.api.ApiInterface
import com.example.postapp.api.Response
import com.example.postapp.models.Post

class PostsRepository() {
    fun getPost(): Any {

    }
}

suspend fun getPosts(): Response<List<Post>> {
        val NonCancellable = null
        return withContext(any = Dispatchers.IO  ) {
            val apiClient = ApiClient.buildService(ApiInterface::class.java)
            val response = apiClient.getPost()
            return@withContext response
        }
    }

    private fun withContext(any: Boolean, function: () -> Response<List<Post>>): Response<List<Post>> {
    }

    private fun withContext(any: Any, function: () -> Response<List<Post>>): Response<List<Post>> {

    }

    fun getPost(): Any {
    }
enum class Dispatchers {
    IO

}
}
}
