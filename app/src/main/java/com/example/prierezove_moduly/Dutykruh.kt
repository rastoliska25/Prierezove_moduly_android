package com.example.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dutykruh.*
import kotlinx.android.synthetic.main.obdlznik.nazad
import kotlin.math.PI

class Dutykruh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dutykruh)

var pi = PI

        val dr1 = findViewById<EditText>(R.id.dr1)
        val dr2 = findViewById<EditText>(R.id.dr2)

        vypocet3.setOnClickListener {
            val r2 = dr1.text.toString().toFloat()
            val r1 = dr2.text.toString().toFloat()
            val z =((pi*((r2*r2*r2*r2)-(r1*r1*r1*r1)))/(4*r2))
            dv.setText("$z")
        }







        nazad.setOnClickListener {
            setContentView(R.layout.activity_main)
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }




    }

}