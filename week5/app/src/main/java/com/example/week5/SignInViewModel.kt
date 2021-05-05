package com.example.week5

import androidx.lifecycle.MutableLiveData

class SignInViewModel {
    val user = MutableLiveData<User>()
    init {
        user.value = User()
    }
}