package com.example.androidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.example.androidstudy.databinding.ActivityMainBinding
import com.example.feature1.UserUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener {
            if(UserUtil.isAdult(binding.et1.text.toString().toInt())) {
                Toast.makeText(this, "성인입니다", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "성인이 아닙니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
}