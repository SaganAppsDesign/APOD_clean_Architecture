package com.example.apod

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getAPODByDate(@Url url:String): Response<APODResponse>

    @GET
    suspend fun getAPODByCount(@Url url:String): Response<List<APODResponse>>
}