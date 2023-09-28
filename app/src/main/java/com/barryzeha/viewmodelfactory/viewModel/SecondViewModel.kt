package com.barryzeha.viewmodelfactory.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import com.barryzeha.viewmodelfactory.MyApp
import com.barryzeha.viewmodelfactory.data.repository.MainRepository


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 28/9/23.
 * Copyright (c)  All rights reserved.
 **/

class SecondViewModel(private val repository: MainRepository,private val savedStateHandle: SavedStateHandle):ViewModel() {

    var count=0
    fun getIncrement(){
        count = repository.getIncrement()
    }
    init {
        count = repository.getIncrement()
    }
    companion object{
       val Factory:ViewModelProvider.Factory = object: ViewModelProvider.Factory{
        override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
            val application = checkNotNull(extras[APPLICATION_KEY])
            val savedStateHandle = extras.createSavedStateHandle()
            return SecondViewModel(
                (application as MyApp).getRepository(),
                savedStateHandle
            )as T
        }
       }
      }
}