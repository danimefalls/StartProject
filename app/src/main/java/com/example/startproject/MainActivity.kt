package com.example.startproject

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dayNumberInput = findViewById<EditText>(R.id.dayNumberInput)
        val showDayButton = findViewById<Button>(R.id.showDayButton)
        val dayNameText = findViewById<TextView>(R.id.dayNameText)
    }
}