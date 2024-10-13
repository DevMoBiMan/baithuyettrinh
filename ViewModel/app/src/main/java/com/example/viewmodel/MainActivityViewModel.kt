package com.example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _count = MutableLiveData(0)

    val count : LiveData<Int>
        get() = _count


    fun increaseCount(){
        _count.value = _count.value?.plus(1)
    }

    fun decreaseCount(){
        _count.value = _count.value?.minus(1)
    }

}