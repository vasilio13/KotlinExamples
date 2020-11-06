package com.example.kotlinexamples

open class Person (val name: String, val surname: String, val age: Int, val address: Address)
data class Address (val index:Int, val street:String)
class Student (name:String, surname: String, age: Int,val group:String ="mobile"): Person(name,surname,age,
Address(220000,"Timiriazeva"))