package com.dicoding.skinai.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.skinai.R
import com.dicoding.skinai.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = getString(R.string.result)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.elevation = 0f
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ion_return)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}