package com.example.lukedevapp.lukeapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val typedName = intent.getStringExtra("TYPED_NAME")
        val tvResult2 = findViewById<TextView>(R.id.tvResult2)
        tvResult2.text = typedName
    }
}