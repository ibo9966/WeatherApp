package com.example.weatherapp.api

import com.example.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/İstanbul")
    suspend fun getWeather():Response<Weather>
}