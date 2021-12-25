package com.example.android.myshoestore

import android.text.Editable
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogInViewModel:ViewModel() {
    private var _userName = ""
    private var _password = ""
    private var _isLoggedIn = MutableLiveData<Boolean>()
    val isLoggedIn:LiveData<Boolean>
       get() = _isLoggedIn

    init{
        Log.i("LoginViewModel","LoginViewModel created")
        _isLoggedIn.setValue(false)
    }

    fun logIn(userName: String, password: String){
         if((_userName == userName) && (password == _password))
             _isLoggedIn.setValue(true)
        else
            _isLoggedIn.setValue(false)
    }

    fun register(userName:String,password:String)
    {
        _userName = userName
        _password = password
        _isLoggedIn.setValue(true)
    }

    fun logOut()
    {
        _isLoggedIn.setValue(false)
    }
}