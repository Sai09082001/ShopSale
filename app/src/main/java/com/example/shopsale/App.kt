package com.example.shopsale

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(){
    private var instance: App? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    fun getInstance(): App {
        if (instance == null) instance = App()
        return instance as App
    }
}