package com.Rf0x.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.obdlznik.*

class Obdlznik : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.obdlznik)


        val ox = findViewById<EditText>(R.id.ox)
        val oy = findViewById<EditText>(R.id.oy)

        vypocet2.setOnClickListener {
            val x = ox.text.toString().toFloat()
            val y = oy.text.toString().toFloat()
           val z = (x*(y*y))/6
          ov.setText("$z")
        }



        nazad.setOnClickListener {
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }

    }

}