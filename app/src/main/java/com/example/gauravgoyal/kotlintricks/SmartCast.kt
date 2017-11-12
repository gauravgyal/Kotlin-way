package com.example.gauravgoyal.kotlintricks

/**
 * Created by gauravgoyal on 11/11/17.
 */

fun Any?.getLength() : Int{
    return if(this is String) this. length else 0
}


fun String?.getString() : String{
    return if(this is String) this as String else ""
}