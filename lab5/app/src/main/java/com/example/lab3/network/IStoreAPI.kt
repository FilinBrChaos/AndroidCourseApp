package com.example.lab3.network

import com.example.lab3.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface IStoreAPI {
    @GET("products")
    suspend fun getProducts(): Response<Array<Product>>
}