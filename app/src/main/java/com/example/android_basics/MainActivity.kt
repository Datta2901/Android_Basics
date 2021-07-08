package com.example.android_basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private var button : Button ?= null
    private var name : TextView ?= null
    private var email : EditText ?=null
    private final var  r1 : RadioButton ?= null
    private final var r2 : RadioButton ?= null
    private var rb : RadioGroup ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.button)
        name = findViewById<TextView>(R.id.textView3)
        r1 = findViewById<RadioButton>(R.id.radioButton6)
        r2 = findViewById<RadioButton>(R.id.radioButton7)
        rb = findViewById<RadioGroup>(R.id.radioGroup)
        email = findViewById<EditText>(R.id.email)

        button?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
//                Toast.makeText(applicationContext, "Button is Clicked!!!", Toast.LENGTH_LONG).show()
                Toast.makeText(this@MainActivity, "Button is Clicked!!!", Toast.LENGTH_LONG).show()
                var clicked:String =""
                clicked = if(r1!!.isChecked()){
                    "Earth"
                }else{
                    "Sun"
                }
                println("\nName Manikanta\n email ${email?.text} \n $clicked")
                var intent:Intent =Intent(this@MainActivity,DisplayData::class.java).apply{
                    putExtra("name","manikanta")
                    putExtra("email",email?.text.toString())
                    putExtra("SelectedOption",clicked)
                }
                startActivity(intent)
            }

        })
    }
}

