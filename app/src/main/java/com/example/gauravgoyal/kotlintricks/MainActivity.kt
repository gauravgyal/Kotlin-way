package com.example.gauravgoyal.kotlintricks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.gauravgoyal.kotlintricks.lazyloading.Group
import com.example.gauravgoyal.kotlintricks.lifecycle.Person
import com.example.gauravgoyal.kotlintricks.lifecycle.compareTo
import com.example.gauravgoyal.kotlintricks.lifecycle.plus
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    companion object {
        const val tag = "Kotlin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setText("I have been accessed without using findViewById")

        // defining properties and action of view
        updateText(text)


        callExtensionFunction()
        callHigherOrderFunction()


        Log.d(tag, "Length of 2 is " + 2.getLength())
        Log.d(tag, "Length of Length is " + "Length".getLength())


        // null pointer exception
        gettingRidOfNull()


        // operator overloading
        operatorOverloading()

        // lazy loading
        val group1 = Group()
        println(group1.people.toString())
        println(group1.people.toString())


        //calling mapping functions
        mappingFunctions()


        //function call with default parameter and parameter name
        var sum = addTwoDigits(2, 3)
        sum = addTwoDigits(second = 2)

        // intiallizing map
        defineMap()


    }


    fun mappingFunctions() {
        class Person(val name: String, val age: Int)

        var listOfPerson = mutableListOf<Person>()
        listOfPerson.add(Person("A", 18))
        listOfPerson.add(Person("E", 14))
        listOfPerson.add(Person("C", 14))
        listOfPerson.add(Person("D", 16))

        val sortedList = listOfPerson.sortedWith(compareBy({ it.age }, { it.name }))
        println(sortedList.toString())

        val list = listOf(1, 2, 3).filter { it != 2 }.map { it * 2 }.sortedWith(compareBy { it })
        println(list.toString())

        val takeList = list.take(1)
        println(takeList)


        val flatMapList = list.flatMap { listOf(it, it + 1) }
        println(flatMapList)


        val groupByList = flatMapList.groupBy { if (it % 2 == 0) "even" else "odd" }
        println(groupByList)
    }


    fun callExtensionFunction(): String {
        var str: String?
        str = "Hello"
        Log.d("Kotlin", str.convertToString())

        str = null
        Log.d("Kotlin", str.convertToString())

        return str.convertToString()
    }


    fun callHigherOrderFunction() {
        AvoidNullPointerException { divide(0, 3) }
        AvoidNullPointerException { divide(3, 3) }
    }


    fun gettingRidOfNull() {
        // this will give compliation error
        // val a : String = null

        val a: String? = null


        // if a is not null then only the expression will be executed else it wont execute
        val b = a?.length


//if a is not null then return length of a else it will return 1, ?: is called elvis operator
        val c = a?.length ?: 1


        // if you are sure that a wont be null then this expression wont check if a is null
        //val d = a!!.length
    }


    fun divide(div: Int, number: Int) {
        number / div
    }

    fun operatorOverloading() {
        val p1 = Person(20, "A")
        val p2 = Person(22, "C")

        val totalAge = p1 + p2
        Log.d(tag, totalAge.toString())

        val p1IsGreater = p1 > p2
        Log.d(tag, p1IsGreater.toString())

    }

    fun updateText(textView: TextView) {
        with(textView) {
            visibility = View.VISIBLE
            text = "Hello world"
            setOnClickListener {
                println("text is clicked")
            }
        }
    }


    fun defineMap() {
        val map = mutableMapOf(
                "keyA" to "valueA",
                "keyB" to "valueB",
                "keyC" to "valueC"
        )
        map.put("keyD", "valueD")
    }

    fun addTwoDigits(first: Int = 1, second: Int): Int {
        return first + second
    }

}
