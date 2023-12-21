package com.example.stockminder.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stockminder.databinding.ActivityWel3Binding
import com.example.stockminder.welcome.Welcome2

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityWel3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWel3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }

    private fun setupAction() {
        binding.btnBack.setOnClickListener{
            startActivity(Intent(this, Welcome2::class.java))
        }
        binding.navigationSign.setOnClickListener{
            startActivity(Intent(this, ))
        }
    }
}
