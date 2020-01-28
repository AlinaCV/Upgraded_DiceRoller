package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_up)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener({countUp()})
    }

    private fun rollDice(){
        val randomInt= (1..6).random()
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text =randomInt.toString()
    }

    private fun countUp(){

        val newText: TextView = findViewById(R.id.result_text)
        if(newText.text.toString() == "Hello World!"){
            newText.text = "1"
        }else{
            if(newText.text.toString() != "6"){
                val newValue : Int = newText.text.toString().toInt()
                newText.text = (newValue+1).toString()
            }

        }

    }
}
