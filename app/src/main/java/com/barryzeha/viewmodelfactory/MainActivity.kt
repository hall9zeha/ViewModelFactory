package com.barryzeha.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.barryzeha.viewmodelfactory.databinding.ActivityMainBinding
import com.barryzeha.viewmodelfactory.viewModel.MainViewModel
import com.barryzeha.viewmodelfactory.viewModel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        viewModel = ViewModelProvider(this,ViewModelFactory(10))[MainViewModel::class.java]
        setText()
        bind.btnAction.setOnClickListener{
            count()
        }

    }
    private fun setText(){
        bind.tvDetail.text=viewModel.count.toString()
    }

    private fun count(){
        viewModel.increment()
        setText()
    }
}
