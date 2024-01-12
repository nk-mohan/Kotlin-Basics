package com.learnwithmohan.operators

fun main() {

    val firstNumber = 5
    val secondNumber = 3

    val text1 = "Start"
    val text2 = " Middle "
    val text3 = "End"

    println("+ - * / %")
    val text = "firstNumber : $firstNumber ${firstNumber + secondNumber}" //firstNumber : 10 13
    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    println("$firstNumber - $secondNumber = ${firstNumber - secondNumber}")
    println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}")

    println(text1 + text2 + text3)
}