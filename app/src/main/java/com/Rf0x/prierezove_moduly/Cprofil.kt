package com.Rf0x.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.cprofil.*
import kotlinx.android.synthetic.main.obdlznik.nazad
import kotlinx.android.synthetic.main.obdlznik.vypocet2

class Cprofil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cprofil)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        val cx1 = findViewById<EditText>(R.id.cx1)
        val cx2 = findViewById<EditText>(R.id.cx2)
        val ch1 = findViewById<EditText>(R.id.ch1)
        val ch2 = findViewById<EditText>(R.id.ch2)


        vypocet2.setOnClickListener {
            val x1 = cx1.text.toString().toFloat()
            val x2 = cx2.text.toString().toFloat()
            val h1 = ch1.text.toString().toFloat()
            val h2 = ch2.text.toString().toFloat()

            val z =(((x1*(h1*h1))/6)-((x2*(h2*h2*h2))/(6*h1)))
            val qq = String.format("%.2f", z)
           cv.setText("$qq")
        }
















        nazad.setOnClickListener {
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }


    }


}





