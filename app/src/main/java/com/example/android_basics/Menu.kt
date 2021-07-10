package com.example.android_basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflator:MenuInflater?=null
        inflator=getMenuInflater()
        inflator?.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.getItemId() == R.id.settings){
            Toast.makeText(this,"Settings is clicked!!!!!!!!",Toast.LENGTH_SHORT).show()
        }else if(item.getItemId() == R.id.About){
            Toast.makeText(this,"About is clicked!!!!!!!!",Toast.LENGTH_SHORT).show()
        }else if(item.getItemId() == R.id.Contact){
            Toast.makeText(this,"Contact is clicked!!!!!!!!",Toast.LENGTH_SHORT).show()
        }else if(item.getItemId() == R.id.Title){
            Toast.makeText(this,"Title is clicked!!!!!!!!",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}