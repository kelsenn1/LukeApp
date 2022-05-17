package com.example.lukedevapp.lukeapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etName = findViewById<TextView>(R.id.etName)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (etName.text.isNotBlank()) {
                tvResult.text = "hello, ${etName.text}!"
            } else {
                etName.error = "text your name..."
            }
        }
    }
}