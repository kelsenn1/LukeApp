package com.example.lukedevapp.lukeapp3

import android.content.Intent
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
        val btSend = findViewById<Button>(R.id.btSend)
        val btSend2 = findViewById<Button>(R.id.btSend2)

        btSend.setOnClickListener {
            if (etName.text.isNotBlank()) {
                tvResult.text = getString(R.string.hello_name, etName.text)
            } else {
                etName.error = getString(R.string.etName_error)
            }
        }
        btSend2.setOnClickListener {
            if (etName.text.isNotBlank()) {
                val typedName = etName.text.toString()
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("TYPED_NAME", typedName)
                startActivity(intent)
            } else {
                etName.error = getString(R.string.etName_error)
            }
        }
    }
}