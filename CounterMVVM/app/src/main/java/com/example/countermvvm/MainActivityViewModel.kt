package com.example.countermvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var sonuc = MutableLiveData<String>()
    
    init {
        sonuc = MutableLiveData<String>("0")
    }


    fun arttirmaIslemi(sonDeger:String) {
       val attirmaSonnuc = (sonDeger.toInt() + 1).toString()
        sonuc.value = attirmaSonnuc
    }

    fun azaltmaIslemi(sonDeger:String) {

       val azaltmaSonuc = (sonDeger.toInt() - 1).toString()
        sonuc.value = azaltmaSonuc

    }


    fun uygulamaIslemi(sonDeger:String,girilenSayi:String) {

        val uygulamaSonuc = (sonDeger.toInt() + girilenSayi.toInt()).toString()
        sonuc.value = uygulamaSonuc

    }
}