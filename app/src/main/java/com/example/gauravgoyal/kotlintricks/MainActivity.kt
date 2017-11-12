package com.example.gauravgoyal.kotlintricks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            text.setText("I have been accessed without using findViewById")
            text.setOnClickListener {
                Log.d("Kotlin", "I have been clicked")
            }



        callExtensionFunction()
        callHigherOrderFunction()


        Log.d("Kotlin", "Length of 2 is " + 2.getLength())
        Log.d("Kotlin", "Length of Length is " + "Length".getLength())


        // null pointer exception
        gettingRidOfNull()


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
        val d = a!!.length
    }


    fun divide(div: Int, number: Int) {
        number / div
    }


}
