package com.example.week5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    val user = MutableLiveData<User>()
    init {
        user.value = User()
    }
}