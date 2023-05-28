package com.example.blaze

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btn)

        btnRoll.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {


        val diceRoll = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.img)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        val txtN: TextView = findViewById(R.id.txtN)
        val txtRR: TextView = findViewById(R.id.txtR)
        var blaze: EditText = findViewById(R.id.rodaroda)

        txtN.text = "O numero sorteado é "+diceRoll.toString()


        if(diceRoll == blaze.text.toString().toInt()){
            txtRR.text = "GANHOU +R$1000 na conta :)"
        }else{
            txtRR.text = "Perdeu men -R$10000 na conta :("
        }

    }

}