package com.sneha.weatherapp.di.component

import com.sneha.weatherapp.di.ActivityScope
import com.sneha.weatherapp.di.module.ActivityModule
import com.sneha.weatherapp.ui.location.LocationActivity
import com.sneha.weatherapp.ui.weather.WeatherActivity
import com.sneha.weatherapp.ui.splash.SplashActivity
import com.sneha.weatherapp.ui.weather.SelectedDayForecastActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: WeatherActivity)

    fun inject(activity: SelectedDayForecastActivity)
}