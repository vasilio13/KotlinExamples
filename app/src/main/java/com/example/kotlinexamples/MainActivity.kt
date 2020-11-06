package com.example.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addr = Address(220000,"Kirova")
        val person = Person("Volodia", "Petrov", 25, addr)

    buttonResult.setOnClickListener() {
        var katA : Double? = edT1.text.toString().toDoubleOrNull()
        var katB : Double? = edT2.text.toString().toDoubleOrNull()
        tV.text = getSquare(katA,katB).toString()
    }

        buttonWeekly.setOnClickListener(){
            tV.text= weekly(edT1.text.toString().toIntOrNull())
        }

    }

}
