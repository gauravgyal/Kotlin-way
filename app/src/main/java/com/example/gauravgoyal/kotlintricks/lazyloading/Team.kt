package com.example.gauravgoyal.kotlintricks.lazyloading

/**
 * Created by gauravgoyal on 21/11/17.
 */

class Team {
    var name: String = ""
    var score: Int = 0
    val players by lazy {
        println("fetching")
        getPlayers(this)
    }
}

fun getPlayers(team: Team): List<String> {
    // hit api request here and get full score card along with each player
    return listOf("A", "B", "C")
}