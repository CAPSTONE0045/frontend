package com.dicoding.skinai.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.skinai.R
import com.dicoding.skinai.databinding.ActivityRegisBinding

class RegisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.elevation = 0f
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ion_return)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.buttonSign.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}