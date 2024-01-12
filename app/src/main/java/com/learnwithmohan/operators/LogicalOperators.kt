package com.learnwithmohan.operators

fun main() {

    val batteryPercentageBelow20 = true
    val gameAppsInUse = true

    // && AND
    val gameAppsClosed = batteryPercentageBelow20 && gameAppsInUse
    println("\n&& (AND) Operator")
    println("gameAppsClosed: $gameAppsClosed")

    // || OR
    val connectedToCharger = batteryPercentageBelow20 || gameAppsInUse
    println("\n|| (OR) Operator")
    println("connectedToCharger: $connectedToCharger")

    // ! NOT
    val answer = true
    val result = !answer
    println("\n! (NOT) Operator")
    println("answer: $answer")
    println("result: $result")

    var i = 10
    val j = 11
    val equals = i <= j && ++i == j
    println("\n Short Circuiting")
    println(equals)
    println(i)
    println(j)
}