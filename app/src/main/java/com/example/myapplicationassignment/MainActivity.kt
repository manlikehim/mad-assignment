package com.example.myapplicationassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


private fun Any.replace(fragmentContainer: Int, fragment: CalculatorFragment): Any {

    return TODO("Provide the return value")
}

class MainActivity: ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Load the default fragment (e.g., CalendarFragment)

        loadFragment(CalculatorFragment())

        // Set up bottom navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_calendar -> loadFragment(CalendarFragment())
                R.id.nav_calculator -> loadFragment(CalculatorFragment())
                R.id.nav_converter -> loadFragment(ConverterFragment())
                R.id.nav_flash_events -> loadFragment(FlashEventsFragment())
            }
            true

        }
    }

    private fun loadFragment(flashEventsFragment: FlashEventsFragment) {
        TODO("Not yet implemented")
    }

    private fun loadFragment(converterFragment: ConverterFragment) {
        TODO("Not yet implemented")
    }

    private fun loadFragment(fragment: CalendarFragment) {
        TODO("Not yet implemented")
    }


    private fun loadFragment(fragment: CalculatorFragment) {
        val supportFragmentManager = null
        var commit = supportFragmentManager.rem()
            .replace(R.id.fragment_container, fragment)
            .apply(
                block = TODO()
            )
    }


    private fun Nothing?.rem(): Any {

        return TODO("Provide the return value")
    }


}







