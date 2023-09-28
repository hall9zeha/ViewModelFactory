package com.barryzeha.viewmodelfactory.viewModel

import androidx.lifecycle.ViewModel
import com.barryzeha.viewmodelfactory.data.repository.MainRepository


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 27/9/23.
 * Copyright (c)  All rights reserved.
 **/

class MainViewModel (initVal:Int): ViewModel(){
  var count =initVal
  fun increment(){
   count++;
  }
}