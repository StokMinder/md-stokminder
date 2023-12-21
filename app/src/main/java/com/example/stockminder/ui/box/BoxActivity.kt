package com.example.stockminder.ui.box
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import com.example.stockminder.R

class BoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_box)

        val btnMenu: Button = findViewById(R.id.btn_menu)

        btnMenu.setOnClickListener { view ->
            showPopupMenu(view)
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
