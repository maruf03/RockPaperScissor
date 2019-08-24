package com.example.rockpaperscissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

class GameOverActivity : AppCompatActivity() {

    lateinit var result:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        var playAgainButton = findViewById<Button>(R.id.playAgainBtn)
        var resultView = findViewById<TextView>(R.id.result)
        var imagePlayerOne = findViewById<ImageView>(R.id.playerOneSelection)
        var imagePlayerTwo = findViewById<ImageView>(R.id.playerTwoSelection)
        var textPlayerOne = findViewById<TextView>(R.id.playerOne)

        var selectionOne = intent.getIntExtra("selectionOne", 1)
        var selectionTwo = intent.getIntExtra("selectionTwo", 1)
        var playerOne:String = intent.getStringExtra("player")

        textPlayerOne.text = playerOne

        when(selectionOne){
            1 -> imagePlayerOne.setImageResource(R.drawable.image_one_rock)
            2 -> imagePlayerOne.setImageResource(R.drawable.image_one_paper)
            3 -> imagePlayerOne.setImageResource(R.drawable.image_one_scissor)
        }
        when(selectionTwo){
            1 ->  imagePlayerTwo.setImageResource(R.drawable.image_two_rock)
            2 ->  imagePlayerTwo.setImageResource(R.drawable.image_two_paper)
            3 ->  imagePlayerTwo.setImageResource(R.drawable.image_two_scissor)
        }
        if(selectionOne == selectionTwo){
            result = "Draw"
        }
        else if (selectionOne == 1 && selectionTwo == 2){
            result = "Player Two"
        }
        else if (selectionOne == 1 && selectionTwo == 3){
            result = playerOne
        }
        else if (selectionOne == 2 && selectionTwo == 3){
            result = "Player Two"
        }
        else if (selectionOne == 2 && selectionTwo == 1){
            result = playerOne
        }
        else if (selectionOne == 3 && selectionTwo == 1){
            result = "Player Two"
        }
        else if (selectionOne == 3 && selectionTwo == 2){
            result = playerOne
        }

        resultView.text = result
        YoYo.with(Techniques.Swing)
            .duration(1000)
            .playOn(imagePlayerOne)
        YoYo.with(Techniques.Swing)
            .duration(1000)
            .playOn(imagePlayerTwo)
        playAgainButton.setOnClickListener {
            var intent = Intent(GameOverActivity@this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
