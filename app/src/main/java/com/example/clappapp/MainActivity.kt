package com.example.clappapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.applauding)
        mediaPlayer1 = MediaPlayer.create(this, R.raw.cinematic)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.retro)

        val buttonClap = findViewById<Button>(R.id.btnClapp)
        buttonClap.setOnClickListener{
            mediaPlayer.start()
        }
        val buttonCinema = findViewById<Button>(R.id.btnCinema)
        buttonCinema.setOnClickListener{
            mediaPlayer1.start()
        }
        val buttonRetro = findViewById<Button>(R.id.btnRetro)
        buttonRetro.setOnClickListener{
            mediaPlayer2.start()
        }
    }
}