package com.example.hackathontemplate.api

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("example")
    val example: String
)