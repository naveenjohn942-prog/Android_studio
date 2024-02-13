package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addingtwonumbers()
    }

    fun addingtwonumbers()
    {
        var num1 = findViewById<EditText>(R.id.number_1)
        var num2 = findViewById<EditText>(R.id.number_2)
        var addButton = findViewById<Button>(R.id.addButton)
        var clearButton = findViewById<Button>(R.id.clearButton)
        var multiplyButton = findViewById<Button>(R.id.multiply)
        var divideButton = findViewById<Button>(R.id.divide)
        var resultView = findViewById<TextView>(R.id.resultTextView)
        var squareRoot = findViewById<Button>(R.id.sqrt)

        addButton.setOnClickListener {

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1+addnum2


            resultView.text = "Addition:$result"
        }
        multiplyButton.setOnClickListener {

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1*addnum2


            resultView.text = "Multiply:$result"

        }
        divideButton.setOnClickListener {

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1/addnum2


            resultView.text = "Divide:$result"

        }

        squareRoot.setOnClickListener {
            val number = num1.text.toString().toDouble()
            if (number >= 0) {
                val result = sqrt(number)
                resultView.text = "Square Root: $result"
            } else {
                resultView.text = "Invalid input for square root"
            }
        }

        clearButton.setOnClickListener {
            num1.setText("");
            num2.setText("");



        }
    }
}