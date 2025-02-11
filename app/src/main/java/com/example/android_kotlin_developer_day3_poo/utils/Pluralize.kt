package com.example.android_kotlin_developer_day3_poo.utils

fun pluralize(singular: String, plural: String, count: Int): String {
    return "${ if (count==1){"$count $singular"}else if(count==0){ "no" }else {"$count $plural"} }"
}