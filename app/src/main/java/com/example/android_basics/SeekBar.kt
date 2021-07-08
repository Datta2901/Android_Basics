package com.example.android_basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.SeekBar

class SeekBar : AppCompatActivity() {
    private var text:TextView ?= null
    private var size: TextView ?= null
    private var seek: SeekBar ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        text = findViewById<TextView>(R.id.textView10)
        size = findViewById<TextView>(R.id.textView11)
        seek = findViewById<SeekBar>(R.id.seekBar3)

        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                text?.setTextSize((progress * 1.3).toFloat())
                size?.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

    }
}