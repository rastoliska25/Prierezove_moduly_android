package com.example.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dutykruh.*
import kotlinx.android.synthetic.main.kruh.*
import kotlinx.android.synthetic.main.obdlznik.*
import kotlinx.android.synthetic.main.obdlznik.nazad
import kotlin.math.PI

class Kruh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kruh)

        var pi = PI

        val kr = findViewById<EditText>(R.id.kr)

        vypocet6.setOnClickListener {
            val r = kr.text.toString().toFloat()
            val d = 2*r
            val z =((pi*(d*d*d))/32)
            kv.setText("$z")
        }

        nazad.setOnClickListener {
            setContentView(R.layout.activity_main)
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }


    }
}