package com.Rf0x.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        o.setOnClickListener {
            val x = Intent(this, Obdlznik::class.java)
            startActivity(x)
        }


        j.setOnClickListener {
            val x1 = Intent(this, Jokel::class.java)
            startActivity(x1)
        }

        k.setOnClickListener {
            val x2 = Intent(this, Kruh::class.java)
            startActivity(x2)
        }

        d.setOnClickListener {
            val x3 = Intent(this, Dutykruh::class.java)
            startActivity(x3)
        }

        c.setOnClickListener {
            val x4 = Intent(this, Cprofil::class.java)
            startActivity(x4)
        }


        i.setOnClickListener {
            val x5 = Intent(this, Iprofil::class.java)
            startActivity(x5)
        }


    }


}




