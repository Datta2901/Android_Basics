package com.example.android_basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.nio.channels.SelectableChannel

class DisplayData : AppCompatActivity() {
    private var name:TextView?= null
    private var email:TextView?= null
    private var selectedOption:TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)
        var intent: Intent = getIntent()
        var pname: String? = intent.getStringExtra("name")
        var pemail: String?= intent.getStringExtra("email")
        var pradio:String?= intent.getStringExtra("SelectedOption")
        name = findViewById<TextView>(R.id.textView4)
        email = findViewById<TextView>(R.id.textView7)
        selectedOption = findViewById<TextView>(R.id.textView9)
        name?.setText(pname)
        email?.setText(pemail)
        selectedOption?.setText(pradio)
    }
}