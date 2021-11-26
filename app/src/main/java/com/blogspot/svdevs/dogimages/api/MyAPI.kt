package com.blogspot.svdevs.dogimages.api

import retrofit2.http.GET

interface MyAPI {
    @GET("/woof.json?ref=apilist.fun")
    suspend fun getRandomDoggo(): Dog
}