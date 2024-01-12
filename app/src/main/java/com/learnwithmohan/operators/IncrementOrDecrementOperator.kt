package com.learnwithmohan.operators

fun main() {

    var total = 9

    println(++total) //10
    println(total)
    println(--total)
    println(total)

    println(total++) //9
    println(total) //10
    println(total--)
    println(total)

    println(total++ + ++total)//20

}