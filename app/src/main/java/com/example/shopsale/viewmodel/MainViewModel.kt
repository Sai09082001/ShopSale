package com.example.shopsale.viewmodel

import android.content.Context
import com.example.shopsale.base.BaseViewModel
import com.example.shopsale.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel

class MainViewModel @Inject constructor(
    @ApplicationContext val context: Context
) : BaseViewModel() {

}