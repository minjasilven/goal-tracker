package com.minjee.goaltracker.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minjee.goaltracker.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkPermissions()
    }

    private fun checkPermissions() {
        // check permissions here and then open first fragment
        openMainFragment()
    }

    private fun openMainFragment() {
        val newFragment = MainFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}