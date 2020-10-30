package com.Rf0x.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.iprofil.*
import kotlinx.android.synthetic.main.obdlznik.nazad

class Iprofil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iprofil)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        val ix = findViewById<EditText>(R.id.ix)
        val ih1 = findViewById<EditText>(R.id.ih1)
        val ih2 = findViewById<EditText>(R.id.ih2)
        val iy = findViewById<EditText>(R.id.iy)


        vypocet4.setOnClickListener {
            val x = ix.text.toString().toFloat()
            val h1 = ih1.text.toString().toFloat()
            val h2 = ih2.text.toString().toFloat()
            val y = iy.text.toString().toFloat()

           val z =(((y*(h1*h1))/6)-((2*x*(h2*h2*h2))/(6*h1)))
            val qq = String.format("%.2f", z)
            iv.setText("$qq")
        }



        nazad.setOnClickListener {
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }




    }

}