package com.example.thenewsapp.media

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)