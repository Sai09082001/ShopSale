package com.example.shopsale.viewmodel

import android.content.Context
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import com.example.shopsale.base.BaseViewModel
import com.example.shopsale.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) : BaseViewModel() {
    val stateSplash =  SingleLiveEvent<Boolean>()

    fun handleSplash(){
        Looper.myLooper()?.let {
            Handler(it).postDelayed({
                stateSplash.value = true
            }, 2000)
        }
    }

    override fun onCleared() {
        super.onCleared()
    }
}