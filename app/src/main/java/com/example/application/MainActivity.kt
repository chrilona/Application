package com.example.application

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnMountain:Button
    lateinit var imgMountain:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMountain =findViewById(R.id.btnMountain)
        btnMountain.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        imgMountain=findViewById(R.id.imgMountain)
        imgMountain.setOnClickListener {
            val intent =Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
