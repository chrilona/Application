package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnPrevQuarry:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        btnPrevQuarry =findViewById(R.id.btnPrevQuarry)
        btnPrevQuarry.setOnClickListener {
            val intent =Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}