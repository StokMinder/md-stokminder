package com.example.stockminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.PopupMenu
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.stockminder.databinding.ActivityMainBinding
import com.example.stockminder.databinding.ActivityWel1Binding
import com.example.stockminder.ui.profile.ProfileActivity
import com.example.stockminder.welcome.Welcome2
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.view

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val btnMenu: Button = findViewById(R.id.btn_menu)
        btnMenu.setOnClickListener { view ->
            showPopupMenu(view)
        }
        supportActionBar?.hide()
    }

    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.inflate(R.menu.bottom_nav_menu)

        popupMenu.setOnMenuItemClickListener { item: MenuItem? ->
            when (item?.itemId) {
                R.id.navigation_home -> {
                    // Aksi untuk Item 1
                    true
                }
                R.id.navigation_movement -> {
                    // Aksi untuk Item 2
                    true
                }
                R.id.navigation_report -> {
                    // Aksi untuk Item 3
                    true
                }
                else -> false
            }
        }

        popupMenu.show()
    }

    private fun setupAction() {
        binding.navigationProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}