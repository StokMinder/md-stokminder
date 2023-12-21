package com.example.stockminder.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.stockminder.databinding.ActivityWel3Binding
import com.example.stockminder.login.Login
import com.example.stockminder.register.CreateAccount

class Welcome3 : AppCompatActivity() {
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
            startActivity(Intent(this, Login::class.java))
        }
        binding.navigationCreate.setOnClickListener{
            startActivity(Intent(this, CreateAccount::class.java))
        }
    }
}
