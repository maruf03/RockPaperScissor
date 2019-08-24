package com.example.rockpaperscissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_two)

        var rockButton = findViewById<Button>(R.id.playerTwoRockBtn)
        var paperButton = findViewById<Button>(R.id.playerTwoPaperBtn)
        var scissorButton = findViewById<Button>(R.id.playerTwoScissorBtn)

        var playerOneSelection = intent.getIntExtra("selection", 1)
        var playerOne = intent.getStringExtra("player")
        rockButton.setOnClickListener {
            var intent = Intent(PlayerTwoActivity@this, GameOverActivity::class.java)
            intent.putExtra("player", playerOne)
            intent.putExtra("selectionOne", playerOneSelection)
            intent.putExtra("selectionTwo", 1)
            startActivity(intent)
        }

        paperButton.setOnClickListener {
            var intent = Intent(PlayerTwoActivity@this, GameOverActivity::class.java)
            intent.putExtra("player", playerOne)
            intent.putExtra("selectionOne", playerOneSelection)
            intent.putExtra("selectionTwo", 2)
            startActivity(intent)
        }

        scissorButton.setOnClickListener {
            var intent = Intent(PlayerTwoActivity@this, GameOverActivity::class.java)
            intent.putExtra("player", playerOne)
            intent.putExtra("selectionOne", playerOneSelection)
            intent.putExtra("selectionTwo", 3)
            startActivity(intent)
        }
    }
}
