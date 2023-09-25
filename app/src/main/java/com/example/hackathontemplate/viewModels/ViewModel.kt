package com.example.hackathontemplate.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hackathontemplate.api.APIService
import com.example.hackathontemplate.api.Response
import com.google.gson.Gson
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ViewModel() : ViewModel() {

    private lateinit var apiService: APIService

    private val _example = MutableLiveData<Response>()
    val example: LiveData<Response> = _example

    init {
        val retrofit = Retrofit.Builder()
            .client(OkHttpClient().newBuilder().build())
            .baseUrl("https://exampleURL.com")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
        apiService = retrofit.create(APIService::class.java)
    }

    fun exampleFetchApiDetails() {
        viewModelScope.launch {
//            Call through to API here using retrofit
        }
    }

}