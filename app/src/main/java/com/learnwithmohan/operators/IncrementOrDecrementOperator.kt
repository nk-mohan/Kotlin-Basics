package com.learnwithmohan.operators

fun main() {
    var total = 9

    total = total + 1 //Output 10

    ++total //Output 10
    --total //Output 9

    println(total++) //Output 9
    //does increment/decrement after completing line
    println(total) //Output 10

    println(total++ + ++total) // 10 + 12 = 22

}