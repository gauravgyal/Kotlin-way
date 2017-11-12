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

