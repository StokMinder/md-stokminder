package com.example.stockminder.ui.movement

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import com.example.stockminder.R
import com.example.stockminder.databinding.ActivityMovementBinding

class MovementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovementBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_movement)
        supportActionBar?.hide()

        val btnMenu: Button = findViewById(R.id.btn_menu)

        btnMenu.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun setupAction(){
        binding.navigationTambah.setOnClickListener {
            startActivity(Intent(this, Tambah::class.java))
        }
        binding.navigationKurang.setOnClickListener {
            startActivity(Intent(this, Kurang::class.java))
        }
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
}