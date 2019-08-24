package com.example.rockpaperscissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var singlePlayerButton = findViewById<Button>(R.id.singlePlayerBtn)
        var multiPlayerButton = findViewById<Button>(R.id.multiplayerBtn)

        singlePlayerButton.setOnClickListener {
            var intent = Intent(MainActivity@this, PlayerTwoActivity::class.java)
            intent.putExtra("player", "Computer")
            intent.putExtra("selection", Random.nextInt(1,4))
            startActivity(intent)
        }
        multiPlayerButton.setOnClickListener {
            var intent = Intent(MainActivity@this, PlayerOneActivity::class.java)
            startActivity(intent)
        }
    }
}
