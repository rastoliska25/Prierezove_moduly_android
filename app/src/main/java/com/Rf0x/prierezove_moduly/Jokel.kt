package com.Rf0x.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.jokel.*
import kotlinx.android.synthetic.main.jokel.nazad

class Jokel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jokel)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        val jx1 = findViewById<EditText>(R.id.jx1)
        val jx2 = findViewById<EditText>(R.id.jx2)
        val jh1 = findViewById<EditText>(R.id.jh1)
        val jh2 = findViewById<EditText>(R.id.jh2)


        vypocet5.setOnClickListener {
            val x1 = jx1.text.toString().toFloat()
            val x2 = jx2.text.toString().toFloat()
            val h1 = jh1.text.toString().toFloat()
            val h2 = jh2.text.toString().toFloat()

            val z = (((x1 * (h1 * h1)) / 6) - ((x2 * (h2 * h2 * h2)) / (6 * h1)))
            val qq = String.format("%.2f", z)
            jv.setText("$qq")
        }




        nazad.setOnClickListener {
            finishAndRemoveTask()
            finishAffinity()
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }


    }

}