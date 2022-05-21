package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var btnNextWaterfall:Button
    lateinit var btnPrevWaterfall:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btnNextWaterfall=findViewById(R.id.btnNextWaterfall)
        btnNextWaterfall.setOnClickListener {
            val intent =Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        btnPrevWaterfall=findViewById(R.id.btnPrevWaterfall)
        btnPrevWaterfall.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}