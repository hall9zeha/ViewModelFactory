package com.barryzeha.viewmodelfactory.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 27/9/23.
 * Copyright (c)  All rights reserved.
 **/

class ViewModelFactory(private val count:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(count) as T
    }
}