package com.barryzeha.viewmodelfactory.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.barryzeha.viewmodelfactory.data.repository.MainRepository


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 28/9/23.
 * Copyright (c)  All rights reserved.
 **/

class ThirdViewModel(private val repository: MainRepository, private val savedStateHandle: SavedStateHandle): ViewModel() {

}