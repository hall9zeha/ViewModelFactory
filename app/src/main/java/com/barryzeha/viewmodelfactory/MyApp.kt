package com.barryzeha.viewmodelfactory

import android.app.Application
import com.barryzeha.viewmodelfactory.data.repository.MainRepository


/**
 * Project ViewModelFactory
 * Created by Barry Zea H. on 28/9/23.
 * Copyright (c)  All rights reserved.
 **/

class MyApp:Application() {
 override fun onCreate() {
  super.onCreate()
 }
 fun getRepository():MainRepository{
  var repository:MainRepository?=null
  if(repository==null){
    repository=MainRepository()
  }
  return repository!!
 }
}