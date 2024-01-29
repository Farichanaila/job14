package com.example.job14

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val busana =findViewById<Button>(R.id.fragmentBusana)
        val to =findViewById<Button>(R.id.TO)
        val PPLG =findViewById<Button>(R.id.PPLG)
        val Tl =findViewById<Button>(R.id.fragmentBiru)
        val Kuliner =findViewById<Button>(R.id.fragmentMerah)

        busana.setOnClickListener{
            val fragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , busana())
            fragmentTransaction.commit()
        }

        to.setOnClickListener{
            val fragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , to())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener{
            val fragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , pplg())
            fragmentTransaction.commit()
        }

        Tl.setOnClickListener{
            val fragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , biru())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener{
            val fragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , merah())
            fragmentTransaction.commit()
        }




    }
}