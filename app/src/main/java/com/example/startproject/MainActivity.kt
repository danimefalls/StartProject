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
        showDayButton.setOnClickListener {
            val input = dayNumberInput.text.toString()
            val dayNumber = input.toIntOrNull()

            val dayName = when (dayNumber) {
                1 -> "Понедельник"
                2 -> "Вторник"
                3 -> "Среда"
                4 -> "Четверг"
                5 -> "Пятница"
                6 -> "Суббота"
                7 -> "Воскресенье"
                else -> "Неверный номер дня недели"
            }

            dayNameText.text = dayName
        }
    }
}