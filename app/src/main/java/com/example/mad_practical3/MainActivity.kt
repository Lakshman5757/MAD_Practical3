package com.example.mad_practical3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var tvRegister: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.btnLogin)
        tvRegister =findViewById(R.id.tvRegister)
        btnLogin.setOnClickListener {
            Toast.makeText(this,"clicked", Toast.LENGTH_LONG).show()
        }
        tvRegister.setOnClickListener {
            val intent = Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}