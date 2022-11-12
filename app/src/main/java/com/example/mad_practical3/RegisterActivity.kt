package com.example.mad_practical3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var btnRegister: Button
    lateinit var tvLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnRegister =findViewById(R.id.btnRegister)
        tvLogin =findViewById(R.id.tvLogin)

        btnRegister.setOnClickListener {
            Toast.makeText(this,"clicked", Toast.LENGTH_SHORT).show()
        }
        tvLogin.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}