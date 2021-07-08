package com.example.android_basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isInvisible

class ViewVisibility : AppCompatActivity() {
    private var b1: Button? = null
    private var b2: Button? = null
    private var b3: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_visibility)
        b1 = findViewById<Button>(R.id.btn1)
        b2 = findViewById<Button>(R.id.btn2)
        b3 = findViewById<Button>(R.id.btn3)
        b1?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                b1?.visibility = View.INVISIBLE
                b2?.visibility = View.VISIBLE
                b3?.visibility = View.VISIBLE
            }
        })

        b2?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                b1?.visibility = View.INVISIBLE
                b2?.visibility = View.VISIBLE
                b3?.visibility = View.VISIBLE
            }
        })

        b3?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                b1?.visibility = View.VISIBLE
                b2?.visibility = View.VISIBLE
                b3?.visibility = View.INVISIBLE
            }
        })
    }

}