package com.example.gauravgoyal.kotlintricks.lifecycle

/**
 * Created by gauravgoyal on 17/11/17.
 */
class Person(
        val age: Int = 0,
        val name: String = ""
)


operator fun Array<String>.get(i: Int) =
        if (this.size > 0) this[i] else ""

operator fun Person.plus(p: Person) = p.age + this.age


operator fun Person.compareTo(p: Person) = this.age - p.age


