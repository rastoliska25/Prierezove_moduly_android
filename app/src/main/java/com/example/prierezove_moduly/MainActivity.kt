package com.example.prierezove_moduly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        o.setOnClickListener {
            setContentView(R.layout.obdlznik)
            val x = Intent(this, Obdlznik::class.java)
            startActivity(x)

        }

        j.setOnClickListener {
            setContentView(R.layout.jokel)
            val x1 = Intent(this, Jokel::class.java)
            startActivity(x1)
        }

        k.setOnClickListener {
            setContentView(R.layout.kruh)
            val x2 = Intent(this, Kruh::class.java)
            startActivity(x2)
        }

        d.setOnClickListener {
            setContentView(R.layout.dutykruh)
            val x3 = Intent(this, Dutykruh::class.java)
            startActivity(x3)
        }

        c.setOnClickListener {
            setContentView(R.layout.cprofil)
            val x4 = Intent(this, Cprofil::class.java)
            startActivity(x4)
        }


        i.setOnClickListener {
            setContentView(R.layout.iprofil)
            val x5 = Intent(this, Iprofil::class.java)
            startActivity(x5)
        }


    }


}








