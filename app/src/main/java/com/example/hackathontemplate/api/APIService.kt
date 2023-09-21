package com.example.hackathontemplate.api

import retrofit2.http.Body
import retrofit2.http.GET

interface APIService {
    @GET("https://exampleURL.com/API")
    suspend fun getExampleDetails() : Response
}