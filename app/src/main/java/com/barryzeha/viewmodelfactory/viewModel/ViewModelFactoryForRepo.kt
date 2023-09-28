package com.barryzeha.viewmodelfactory.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import com.barryzeha.viewmodelfactory.data.repository.MainRepository


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 28/9/23.
 * Copyright (c)  All rights reserved.
 **/

class ViewModelFactoryForRepo(private val repository: MainRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        val savedStateHandle = extras.createSavedStateHandle()
        return ThirdViewModel(repository,savedStateHandle) as T
    }
}