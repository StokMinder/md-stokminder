package com.example.stockminder.ui.movement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stockminder.R
import com.example.stockminder.databinding.ActivityTambahBinding
import com.example.stockminder.ui.box.BoxActivity
import kotlinx.android.synthetic.main.activity_tambah.btn_kurang
import kotlinx.android.synthetic.main.activity_tambah.btn_tambah
import kotlinx.android.synthetic.main.activity_tambah.tvCounter

class Kurang : AppCompatActivity() {
    private var counter = 0
    private lateinit var binding: ActivityTambahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTambahBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_tambah)

        supportActionBar?.hide()


        tvCounter.text = counter.toString()

        btn_tambah.setOnClickListener {
            counter++
            tvCounter.text = counter.toString()
        }
        btn_kurang.setOnClickListener {
            if (counter > 0) { // To ensure counter doesn't go negative
                counter--
                tvCounter.text = counter.toString()
            }
        }
    }
    private fun submitAction(){
        binding.btnSubmit.setOnClickListener{
            startActivity(Intent(this, BoxActivity::class.java))
        }
    }
}