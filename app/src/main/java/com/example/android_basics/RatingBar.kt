package com.example.android_basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.RatingBar


class RatingBar : AppCompatActivity() {
    private var rate:RatingBar ?= null
    private var text:TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        rate = findViewById<RatingBar>(R.id.ratingBar)
        text = findViewById<TextView>(R.id.textView14)

        rate?.setOnRatingBarChangeListener(object :RatingBar.OnRatingBarChangeListener{
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                text?.setText("Value is $rating")
                // By default it is float
                // We can use stepValue method in xml to get only int
            }
        })
    }
}