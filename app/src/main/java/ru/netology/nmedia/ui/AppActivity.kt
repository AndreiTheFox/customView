package ru.netology.nmedia.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inputData = listOf(
            500F,
            500F,
            500F,
            500F,
        )
        val sum = inputData.sum()
        if (sum != 0F) findViewById<StatsView>(R.id.stats).data = inputData.map { it / sum * 100F }
        else {
            val errorText = "No data to display"
            Toast.makeText(this, errorText, Toast.LENGTH_LONG).show()
        }
    }
}