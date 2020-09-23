package com.example.postapp.api

import com.example.postapp.models.Post

interface ApiInterface {
    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>
    abstract fun getPost(): Response<List<Post>>
}

class Response<T> {

}

annotation class GET(val value: String)
