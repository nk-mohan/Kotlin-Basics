package com.learnwithmohan.operators


fun main() {

    val numbers = listOf(1, 3, 10, 20)
    val randomNumber = (1..20).random()

    if (randomNumber in numbers) {
        println("randomNumber is in the list of numbers!")
    } else {
        println("randomNumber is not in the list of numbers!")
    }

    if (randomNumber !in numbers) {
        println("randomNumber is not in the list of numbers!")
    }
}
