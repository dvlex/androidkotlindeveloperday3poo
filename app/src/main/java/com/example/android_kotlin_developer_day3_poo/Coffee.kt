package com.example.android_kotlin_developer_day3_poo

// in the initializer, if you dont put val or var, those will be paramenteres, else will be
// properties, only properties could be accessed in the instance
class Coffee(
    val owner: String,
    var sugarCount: Int
) {
    // ini is the constructor, anyway, you can use the parentesis as constructor
    init {
        println("your coffee is starting to being make...")
        makeCoffee(sugarCount, owner)
    }
}