package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridBut: Button = findViewById(R.id.grid)
        val linearBut: Button = findViewById(R.id.linear)

        gridBut.setOnClickListener{

            val intent = Intent(this, MainActivity2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            startActivity(intent)
        }
        linearBut.setOnClickListener{

            val intent = Intent(this, MainActivity3::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            startActivity(intent)
        }
    }
}