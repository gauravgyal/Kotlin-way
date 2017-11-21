package com.example.gauravgoyal.kotlintricks.lifecycle

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.util.Log
import com.example.gauravgoyal.kotlintricks.R

class Main2Activity : AppCompatActivity() {

    val tag ="LifeCycleEvent"
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d(tag,"onActivityCreate2")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(tag,"onActivitySaveInstance")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putString("test","aas")
        Log.d(tag,"onActivitySaveInstance1")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(tag,"onActivityRestoreInstance1")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d(tag,"onActivityRestoreInstance2")
    }

    override fun getApplicationContext(): Context {
        return super.getApplicationContext()
    }

    override fun isFinishing(): Boolean {
        return super.isFinishing()
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.d(tag,"onActivityPostCreate")
    }

    override fun supportFinishAfterTransition() {
        super.supportFinishAfterTransition()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        Log.d(tag,"onActivityAttachFragment")
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.d(tag,"onActivityPostCreate")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(tag,"onActivityCreate1")

        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onActivityStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"onActivityResume")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(tag,"onActivityPostResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,isFinishing.toString())
        Log.d(tag,"onActivityonPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,isFinishing.toString())
        Log.d(tag,"onActivityonStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,isFinishing.toString())
        Log.d(tag,"onActivityonDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"onActivityonRestart")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.d(tag,"onActivityonConfigChange")
    }





}
