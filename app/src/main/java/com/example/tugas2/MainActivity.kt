package com.example.tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonintent : Button
    private lateinit var  daftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonintent = findViewById(R.id.buttoninten)
        buttonintent.setOnClickListener(this)

        buttonintent.setOnClickListener{
            Intent(this,receycleview::class.java).also{
                startActivity(it)
            }
        }
        daftar = findViewById(R.id.daftarinten)
        daftar.setOnClickListener(this)

        daftar.setOnClickListener {
            Intent(this, MainActivity4::class.java).also {
                startActivity(it)
            }
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

//    cara ke da dalam intent
//    override fun onClick(p0: View) {
//        when (p0.id) {
//            R.id.buttoninten -> {
//                val intensaja = Intent(this@MainActivity, receycleview::class.java)
//                startActivity(intensaja)
//            }
//            R.id.daftarinten -> {
//                val intendua = Intent(this@MainActivity, MainActivity2::class.java)
//                startActivity(intendua)
//            }
//        }
//    }

}