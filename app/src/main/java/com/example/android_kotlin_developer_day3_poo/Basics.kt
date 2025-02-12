package com.example.android_kotlin_developer_day3_poo

fun main() {
    val myCoffeeData = CoffeeData("Alex", 1, HotDrinkSize.TINY)
    val myCoffee = Coffee(myCoffeeData)
    println("have a nice day ${myCoffee.coffeeData.owner}")
}
