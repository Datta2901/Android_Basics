package com.example.android_basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class WebView : AppCompatActivity() {
    private var web: WebView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        web = findViewById<WebView>(R.id.web)
        web?.settings?.javaScriptEnabled
        web?.loadUrl("")
        //url name
    }
}