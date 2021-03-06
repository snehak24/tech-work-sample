package com.sneha.weatherapp.data.model

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("coord")
    val coordinates: Coordinates,

    @SerializedName("weather")
    val weather: List<WeatherData>,

    @SerializedName("base")
    val base: String,

    @SerializedName("main")
    val main: MainData,

    @SerializedName("visibility")
    val visibility: Double,

    @SerializedName("wind")
    val wind: Wind,

    @SerializedName("clouds")
    val clouds: Clouds,

    @SerializedName("dt")
    val dt: Long,

    @SerializedName("sys")
    val sys: Sys,

    @SerializedName("timezone")
    val timezone: Double,

    @SerializedName("id")
    val id: Double,

    @SerializedName("name")
    val cityName: String,

    @SerializedName("cod")
    val cod: Int
) {

    data class Coordinates(
        @SerializedName("lon")
        val longitude: Double,

        @SerializedName("lat")
        val latitude: Double
    )

    data class WeatherData(
        @SerializedName("id")
        val id: Int,

        @SerializedName("main")
        val main: String,

        @SerializedName("description")
        val description: String,

        @SerializedName("icon")
        val icon: String
    )

    data class MainData(
        @SerializedName("temp")
        val temperature: Double,

        @SerializedName("feels_like")
        val feelsLike: Double,

        @SerializedName("temp_min")
        val temperatureMin: Double,

        @SerializedName("temp_max")
        val temperatureMax: Double,

        @SerializedName("pressure")
        val pressure: Int,

        @SerializedName("humidity")
        val humidity: Int
    )

    data class Wind(
        @SerializedName("speed")
        val speed: Double,

        @SerializedName("deg")
        val degree: Double
    )

    data class Sys(
        @SerializedName("type")
        val type: Int,

        @SerializedName("id")
        val id: Int,

        @SerializedName("country")
        val country: String,

        @SerializedName("sunrise")
        val sunrise: Long,

        @SerializedName("sunset")
        val sunset: Long
    )

    data class Clouds(
        @SerializedName("all")
        val all: Int
    )
}