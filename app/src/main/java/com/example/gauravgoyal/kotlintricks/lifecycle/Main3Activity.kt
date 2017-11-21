package com.example.gauravgoyal.kotlintricks.lifecycle

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.gauravgoyal.kotlintricks.R

class Main3Activity: AppCompatActivity() {

    val tag ="LifeCycleEvent"
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d(tag,"onActivity2Create2")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(tag,"onActivity2SaveInstance")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(tag,"onActivity2RestoreInstance1")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d(tag,"onActivity2RestoreInstance2")
    }

    override fun getApplicationContext(): Context {
        return super.getApplicationContext()
    }

    override fun isFinishing(): Boolean {
        return super.isFinishing()
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.d(tag,"onActivity2PostCreate")
    }

    override fun supportFinishAfterTransition() {
        super.supportFinishAfterTransition()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        Log.d(tag,"onActivity2AttachFragment")
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.d(tag,"onActivity2PostCreate")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(tag,"onActivity2Create1")



        val frag = BlankFragment.newInstance()

        supportFragmentManager.beginTransaction().add(R.id.container, frag,"ds").commit();

        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onActivity2Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"onActivity2Resume")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(tag,"onActivity2PostResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,isFinishing.toString())
        Log.d(tag,"onActivity2onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,isFinishing.toString())
        Log.d(tag,"onActivity2onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,isFinishing.toString())
        Log.d(tag,"onActivity2onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"onActivity2onRestart")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.d(tag,"onActivity2onConfigChange")
    }





}