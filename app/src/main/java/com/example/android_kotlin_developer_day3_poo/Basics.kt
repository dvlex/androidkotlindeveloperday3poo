package com.example.android_kotlin_developer_day3_poo

fun main() {
    //makeCoffee(1, "John")
    //makeCoffee(2, "Jane")
    //makeCoffee(10, "Doe")
    //makeCoffee(0, "Doe")
    //makeCoffee(-1, "Doe")
    val myCoffee = Coffee("Alex",1)
    println(" have a nice day ${myCoffee.owner}")
}

fun makeCoffee(sugarCount: Int, name: String){
    require(sugarCount >= 0) { "Sugar count must be greater than or equal to 0" }

    println("""
        The Coffee for $name, is ready 
        with ${ pluralize("spoon of","spoons of", sugarCount) } sugar
    """)
}

fun pluralize(singular: String, plural: String, count: Int): String {
    return "${ if (count==1){"$count $singular"}else if(count==0){ "no" }else {"$count $plural"} }"
}

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