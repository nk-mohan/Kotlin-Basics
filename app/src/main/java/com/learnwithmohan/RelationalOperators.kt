package com.learnwithmohan

fun main() {
    val number = 10
    val biggerNumber = 12
    val randomNumber = (1..20).random()

    if (number > biggerNumber) {
        println("number is greater than biggerNumber")
    }

    if (number < biggerNumber) {
        println("number is less than biggerNumber")
    }

    if (number >= biggerNumber) {
        println("number is greater than or equal to biggerNumber")
    }

    if (number <= biggerNumber) {
        println("number is less than or equal to biggerNumber")
    }

    if (number == biggerNumber) {
        println("number is equal to biggerNumber")
    }

    if (number != biggerNumber) {
        println("number is not equal to biggerNumber")
    }

    if (number < biggerNumber && number < randomNumber) {
        println("number is less than biggerNumber and also less than randomNumber")
    }

    if (number < biggerNumber || number > randomNumber) {
        println("number is less than biggerNumber and also less than randomNumber")
    }
}