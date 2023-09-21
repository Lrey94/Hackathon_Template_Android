package com.example.hackathontemplate.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hackathontemplate.api.APIService
import kotlinx.coroutines.launch

class ViewModel(private val APIService: APIService) : ViewModel() {

    fun exampleFetchApiDetails() {
        viewModelScope.launch {
//            Call through to API here using retrofit
        }
    }

}