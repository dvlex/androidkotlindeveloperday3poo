package com.example.android_kotlin_developer_day3_poo

import com.example.android_kotlin_developer_day3_poo.utils.pluralize

// in the initializer, if you dont put val or var, those will be paramenteres, else will be
// properties, only properties could be accessed in the instance
class Coffee(
    val coffeeData: IHotDrinkData
) {
    // ini is the constructor, anyway, you can use the parentesis as constructor
    init {
        println("your coffee is starting to being make...")
        makeCoffee(coffeeData.sugarCount, coffeeData.owner, coffeeData.size)
    }

    private fun makeCoffee(sugarCount: Int, name: String, size: HotDrinkSize){

        println("""
        The ${size.name.lowercase()} Coffee for $name, is ready 
        with ${ pluralize("spoon of","spoons of", sugarCount) } sugar
    """)
    }
}