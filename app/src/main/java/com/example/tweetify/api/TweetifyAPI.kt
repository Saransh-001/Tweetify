package com.example.tweetify.api

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.example.tweetify.model.Tweet
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import kotlin.coroutines.coroutineContext

interface TweetifyAPI {

    @GET("/v3/b/66dd9e97acd3cb34a880343e?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<Tweet>>

    @GET("/v3/b/66dd9e97acd3cb34a880343e?meta=false")
    @Headers("X-JSON-Path: tweets..category")
    suspend fun getCategories(): Response<List<String>>

}

