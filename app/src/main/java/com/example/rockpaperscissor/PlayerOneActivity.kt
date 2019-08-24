package com.example.rockpaperscissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_one)

        var rockButton = findViewById<Button>(R.id.playerOneRockBtn)
        var paperButton = findViewById<Button>(R.id.playerOnePaperBtn)
        var scissorButton = findViewById<Button>(R.id.playerOneScissorBtn)

        rockButton.setOnClickListener {
            var intent = Intent(PlayerOneActivity@this, PlayerTwoActivity::class.java)
            intent.putExtra("player", "Player One")
            intent.putExtra("selection", 1)
            startActivity(intent)
        }

        paperButton.setOnClickListener {
            var intent = Intent(PlayerOneActivity@this, PlayerTwoActivity::class.java)
            intent.putExtra("player", "Player One")
            intent.putExtra("selection", 2)
            startActivity(intent)
        }

        scissorButton.setOnClickListener {
            var intent = Intent(PlayerOneActivity@this, PlayerTwoActivity::class.java)
            intent.putExtra("player", "Player One")
            intent.putExtra("selection", 3)
            startActivity(intent)
        }
    }
}
