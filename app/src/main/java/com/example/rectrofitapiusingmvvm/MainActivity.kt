package com.example.rectrofitapiusingmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.rectrofitapiusingmvvm.Rectrofit.JsonPlaceHolderViewModel
import com.example.rectrofitapiusingmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val viewModel= ViewModelProvider(this)[JsonPlaceHolderViewModel::class.java]
        dataBinding.btnPost.setOnClickListener {
          val intent = Intent(this@MainActivity,Post::class.java)
            startActivity(intent)
        }
    }
}
