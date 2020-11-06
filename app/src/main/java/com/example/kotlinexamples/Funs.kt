package com.example.kotlinexamples

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Каждый"
        Color.ORANGE -> "Охотник"
        Color.YELLOW -> "Желает"
        Color.GREEN -> "Знать"
        Color.BLUE -> "Где"
        Color.INDIGO -> "Сидит"
        Color.VIOLET -> "Фазан"
    }

fun weekly(numberDay: Int?):String =
    when (numberDay) {
        1->"Понедельник"
        2->"Вторник"
        3->"Среда"
        4->"Четверг"
        5->"Пятница"
        6->"Суббота"
        7->"Воскресенье"
        else->"не день недели"

    }

