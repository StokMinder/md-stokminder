package com.example.stockminder.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stockminder.databinding.ActivityWel2Binding

class Welcome2 : AppCompatActivity() {
    private lateinit var binding: ActivityWel2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWel2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }

    private fun setupAction() {
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, Welcome3::class.java))
        }
        binding.btnBack.setOnClickListener{
            startActivity(Intent(this, Welcome1::class.java))
        }
    }
}