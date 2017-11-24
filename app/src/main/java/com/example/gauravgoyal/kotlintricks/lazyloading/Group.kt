package com.example.gauravgoyal.kotlintricks.lazyloading

/**
 * Created by gauravgoyal on 21/11/17.
 */

class Group {
    var name: String = ""
    val people by lazy {
        println("computing")
        getPeople(this) }
}

fun getPeople(group: Group): List<String> {
    return listOf("A", "B", "C")
}