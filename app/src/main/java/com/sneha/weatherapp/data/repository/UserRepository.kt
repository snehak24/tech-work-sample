package com.sneha.weatherapp.data.repository

import com.sneha.weatherapp.data.local.prefs.UserPreferences
import com.sneha.weatherapp.data.model.LocationData
import com.sneha.weatherapp.data.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
//    private val networkService: NetworkService,
//    private val databaseService: DatabaseService,
    private val userPreferences: UserPreferences
) {

    fun saveCurrentUser(user: User) {
        userPreferences.setUserId(user.id)
        userPreferences.setUserName(user.name)
        userPreferences.setUserEmail(user.email)
        userPreferences.setAccessToken(user.accessToken)
    }

    fun removeCurrentUser() {
        userPreferences.removeUserId()
        userPreferences.removeUserName()
        userPreferences.removeUserEmail()
        userPreferences.removeAccessToken()
    }

    fun getCurrentUser(): User? {

        val userId = userPreferences.getUserId()
        val userName = userPreferences.getUserName()
        val userEmail = userPreferences.getUserEmail()
        val accessToken = userPreferences.getAccessToken()

        return if (userId !== null && userName != null && userEmail != null && accessToken != null)
            User(userId, userName, userEmail, accessToken)
        else
            null
    }

    fun saveLocationData(locationData: LocationData){
        userPreferences.setLatitude(locationData.latitude.toString())
        userPreferences.setLongitude(locationData.longitude.toString())
    }

    fun getLocationData() : LocationData? {
        val latitude = userPreferences.getLatitude()
        val longitude = userPreferences.getLongitude()
        return  if(!latitude.isNullOrEmpty() && !longitude.isNullOrEmpty()) {
            LocationData(longitude.toDouble(), latitude.toDouble())
        }else
            null
    }
 }