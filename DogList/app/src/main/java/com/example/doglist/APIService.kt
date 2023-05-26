package com.example.doglist

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getDogsBreeds(@Url url: String): Response<DogResponse>
}