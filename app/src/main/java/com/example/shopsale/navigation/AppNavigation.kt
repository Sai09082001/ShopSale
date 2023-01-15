package com.example.shopsale.navigation

import android.os.Bundle
import com.example.shopsale.base.BaseNavigator

interface AppNavigation : BaseNavigator {
    fun openSplashToLoginScreen( bundle: Bundle?= null)
}