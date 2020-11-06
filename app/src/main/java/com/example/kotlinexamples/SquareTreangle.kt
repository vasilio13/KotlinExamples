package com.example.kotlinexamples



fun getSquare(katetA: Double?, katetB: Double?) =

    katetB?.let {
        val a = it
        katetA?.let{
a * it / 2
        }
    }


