package com.learnwithmohan.operators

fun main() {
    var total = 10

    total = total + 1 //Output 11

    ++total //Output 11
    --total //Output 10

    println(total++) //Output 10
    //does increment/decrement after completing line
    println(total) //Output 11

    println(total++ + ++total)

}