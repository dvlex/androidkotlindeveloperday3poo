package com.example.android_kotlin_developer_day3_poo

fun main() {
    //makeCoffee(1, "John")
    //makeCoffee(2, "Jane")
    //makeCoffee(10, "Doe")
    //makeCoffee(0, "Doe")
    //makeCoffee(-1, "Doe")
    val myCoffeeData = CoffeeData("Alex", 1, HotDrinkSize.TINY)
    val myCoffee = Coffee(myCoffeeData)
    println(" have a nice day ${myCoffee.coffeeData.owner}")
}
