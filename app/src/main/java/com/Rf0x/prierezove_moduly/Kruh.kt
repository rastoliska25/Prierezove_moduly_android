package com.Rf0x.prierezove_moduly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kruh.*
import kotlinx.android.synthetic.main.obdlznik.nazad
import kotlin.math.PI

class Kruh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kruh)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        var pi = PI

        val kr = findViewById<EditText>(R.id.kr)

        vypocet6.setOnClickListener {
            val r = kr.text.toString().toFloat()
            val d = 2*r
            val z =((pi*(d*d*d))/32)
            kv.setText("$z")
        }

        nazad.setOnClickListener {
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }


    }
}