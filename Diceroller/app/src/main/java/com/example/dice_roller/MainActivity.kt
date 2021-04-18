package com.example.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
        //Function to show the number on the text view
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        //If else to set the dice image to show the number
        if (diceRoll == 1) {
            diceImage.setImageResource(R.drawable.dice_1)
        } else if (diceRoll == 2) {
            diceImage.setImageResource(R.drawable.dice_2)
        } else if (diceRoll == 3) {
            diceImage.setImageResource(R.drawable.dice_3)
        } else if (diceRoll == 4) {
            diceImage.setImageResource(R.drawable.dice_4)
        } else if (diceRoll == 5) {
            diceImage.setImageResource(R.drawable.dice_5)
        } else if (diceRoll == 6) {
            diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}