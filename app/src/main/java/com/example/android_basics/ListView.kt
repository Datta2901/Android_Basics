package com.example.android_basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.ListView

class ListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val arrayAdapter: ArrayAdapter<*>
//        by default scroll bar will be available
        val users = arrayOf(
//            "Rama Krishna","Sujatha","Madhu Kiran","Manikanta","Rama Krishna","Sujatha","Madhu Kiran","Manikanta","Rama Krishna","Sujatha","Madhu Kiran","Manikanta","Rama Krishna","Sujatha","Madhu Kiran","Manikanta"
            "Rama Krishna","Sujatha","Madhu Kiran","Manikanta"
        )

        var lv = findViewById<ListView>(R.id.list)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        lv?.adapter = arrayAdapter

        lv?.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked name :"+" "+users[position],Toast.LENGTH_SHORT).show()
        }
    }
}