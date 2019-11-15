package com.example.snackbarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener{
            val snackbar = Snackbar.make(root_layout,"Welcome to CodeAndroid",Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Close", View.OnClickListener {
                snackbar.dismiss()
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            val view = snackbar.view
            val text = view.findViewById<TextView>(R.id.snackbar_text)
            text.setTextColor(ContextCompat.getColor(this,R.color.colorAccent))
            snackbar.show()
        }

    }
}
