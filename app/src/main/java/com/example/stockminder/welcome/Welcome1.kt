package com.example.stockminder.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.stockminder.R
import com.example.stockminder.databinding.ActivityWel1Binding

class Welcome1 : AppCompatActivity() {
    private lateinit var binding: ActivityWel1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWel1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }

    private fun setupAction() {
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, Welcome2::class.java))
        }
    }
}