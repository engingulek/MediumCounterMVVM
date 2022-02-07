package com.example.countermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.countermvvm.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  lateinit var tasarim : ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)


tasarim.mainActivityNesnesi = this


        // dinliyoruz
        // nerde çalışıyorsun tetikleme sonucunda gelen sonuç
        viewModel.sonuc.observe(this,{
            tasarim.sonuc = it
        })



    }


    fun arttır(sonDeger:String) {
viewModel.arttirmaIslemi(sonDeger)


    }

    fun azalt(sonDeger:String) {
        viewModel.azaltmaIslemi(sonDeger)


    }

    fun uygula(sonDeger:String,girilenSayi:String) {
        viewModel.uygulamaIslemi(sonDeger,girilenSayi)


    }
}