package com.barryzeha.viewmodelfactory.data.repository


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 28/9/23.
 * Copyright (c)  All rights reserved.
 **/

class MainRepository {
    private var count = 0
      fun getIncrement():Int{
        return  count++;
      }
}