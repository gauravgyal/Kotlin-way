package com.example.gauravgoyal.kotlintricks

/**
 * Created by gauravgoyal on 11/11/17.
 */


// this is why you can call toString method in kotlin without fearing that it  giving null pointer exception

fun String?.convertToString(): String {
    if (this == null)
        return "null";
    else
        return this.toString();
}

fun Int.isPrime(): Boolean {
    if (this <= 1) return false

    // Check from 2 to n-1
    for (i in 2 until this)
        if (this % i === 0)
            return false

    return true
}