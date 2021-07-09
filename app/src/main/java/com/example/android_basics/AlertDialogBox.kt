package com.example.android_basics

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.OnBackPressedCallback

class AlertDialogBox : AppCompatActivity() {
    private var btn1 : Button ?= null
    private var btn2 : Button ?= null
    private var btn3 : Button?= null
    private var name : TextView?= null
    private var email : TextView ?= null
    private var pass : TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog_box)
        btn1 = findViewById<Button>(R.id.button2)
        btn2 = findViewById<Button>(R.id.button3)
        btn3 = findViewById<Button>(R.id.button4)
        name = findViewById<TextView>(R.id.textView13)
        email = findViewById<TextView>(R.id.textView15)
        pass = findViewById<TextView>(R.id.textView16)

        btn1?.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                name?.setText("Manikanta")
            }
        })

        btn2?.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                email?.setText("Manikanta@gmail.com")
            }
        })

        btn3?.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {

                var builder: AlertDialog.Builder? = null
                builder = AlertDialog.Builder(this@AlertDialogBox)

                builder?.setTitle("This is Alert Dialogue!!")
                builder?.setMessage("Are u sure??")
                    ?.setPositiveButton("Ok", object:DialogInterface.OnClickListener{
                            override fun onClick(dialog: DialogInterface?, which: Int) {
                                pass?.setText("Manikantamanikanta")
                            }
                    })
                    ?.setNegativeButton("cancel",object:DialogInterface.OnClickListener{
                        override fun onClick(dialog: DialogInterface?, which: Int) {
                            pass?.setText("password")
                        }
                    })

                var alert:AlertDialog ?= null
                alert = builder?.create()
                alert?.show()
            }
        })
    }


    override fun onBackPressed() {

        var builder: AlertDialog.Builder? = null
        builder = AlertDialog.Builder(this@AlertDialogBox)
        builder?.setTitle("This is Alert Dialogue!!")
        builder?.setMessage("Are u sure??")
            ?.setNegativeButton("cancel",null)
            ?.setPositiveButton("Ok", object:DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    finish()
//                    super.onBackPressed()
                }
            })

        var alert:AlertDialog ?= null
        alert = builder?.create()
        alert?.show()
    }
}



