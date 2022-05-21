package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var btnNextCliff:Button
    lateinit var btnPrevCliff:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnNextCliff  =findViewById(R.id.btnNextCliff)
        btnNextCliff.setOnClickListener {
            val intent =Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        btnPrevCliff =findViewById(R.id.btnPrevClif)
        btnPrevCliff.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}