package com.dicoding.skinai.ui

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.dicoding.skinai.R
import com.dicoding.skinai.databinding.ActivityCameraBinding

class CameraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCameraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = getString(R.string.title_check)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.elevation = 0f
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ion_return)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.apply {
            buttonCheck.setOnClickListener {
                val intent = Intent(this@CameraActivity, ResultActivity::class.java)
                startActivity(intent)
            }
        }
    }

}