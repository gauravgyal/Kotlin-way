package com.example.gauravgoyal.kotlintricks

import android.util.Log

/**
 * Created by gauravgoyal on 11/11/17.
 */


fun AvoidNullPointerException( body : () -> Unit){
    try{
        body
    }
    catch (e : NullPointerException){
        Log.d("Kotlin","NullPointerException")
    }
}
