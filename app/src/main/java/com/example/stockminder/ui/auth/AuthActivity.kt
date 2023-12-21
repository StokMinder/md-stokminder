package com.example.stockminder.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.nutripal.R
import com.example.stockminder.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigation_home) as NavHostFragment

//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        val navController = navHostFragment.navController
    }
}