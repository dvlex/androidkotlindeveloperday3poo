package com.example.android_kotlin_developer_day3_poo

data class CoffeeData(
    override val owner: String,
    override val sugarCount: Int,
    override val size: HotDrinkSize
): IHotDrinkData {
    init {
        require(sugarCount >= 0) { "Sugar count must be greater than or equal to 0" }
        require(owner.isNotEmpty()) {"It's necessary an owner name"}
        require(size != null) {"size is required"}
    }
}
