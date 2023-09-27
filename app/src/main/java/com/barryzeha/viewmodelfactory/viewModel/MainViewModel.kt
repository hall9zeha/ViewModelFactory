package com.barryzeha.viewmodelfactory.viewModel

import androidx.lifecycle.ViewModel


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 27/9/23.
 * Copyright (c)  All rights reserved.
 **/

class MainViewModel : ViewModel(){
  var count =0
  fun increment(){
   count++;
  }
}