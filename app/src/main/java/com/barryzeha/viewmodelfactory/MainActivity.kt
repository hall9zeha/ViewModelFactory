package com.barryzeha.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.barryzeha.viewmodelfactory.databinding.ActivityMainBinding
import com.barryzeha.viewmodelfactory.viewModel.MainViewModel
import com.barryzeha.viewmodelfactory.viewModel.SecondViewModel
import com.barryzeha.viewmodelfactory.viewModel.ThirdViewModel
import com.barryzeha.viewmodelfactory.viewModel.ViewModelFactory
import com.barryzeha.viewmodelfactory.viewModel.ViewModelFactoryForRepo

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var bind:ActivityMainBinding
    //usando argumentos de clase repository
    private  val secondViewModel: SecondViewModel by viewModels{SecondViewModel.Factory}

    private lateinit var thirdViewModel:ThirdViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        //pasándole un argumento primitivo
        //viewModel = ViewModelProvider(this,ViewModelFactory(10))[MainViewModel::class.java]

        //usando como argumento una clase repositorio inyectada desde MainActivity
        thirdViewModel = ViewModelProvider(this,
            ViewModelFactoryForRepo((application as MyApp).getRepository()))[ThirdViewModel::class.java]

        setText()
        bind.btnAction.setOnClickListener{
            count()
        }

    }
    private fun setText(){
        //con MainViewModel y argumento primitivo
        //bind.tvDetail.text=viewModel.count.toString()

        //con SecondViewModel y repositorio como argumento
        //bind.tvDetail.text = secondViewModel.count.toString()

        //con thirdViewModel
        bind.tvDetail.text= thirdViewModel.count.toString()
    }

    private fun count(){
        //con MainViewModel
        //viewModel.increment()

        //con SecondViewModel
        //secondViewModel.getIncrement()

        //con thirdViewModel
        thirdViewModel.getIncrement()

        setText()
    }
}
