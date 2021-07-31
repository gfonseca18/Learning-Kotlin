/*
Kotlin | Swap two numbers:
Here, we are going to learn how to swap two given numbers in Kotlin programming language?
Submitted by IncludeHelp, on April 20, 2020

Given two numbers, we have to swap them.

Example:

    Input:
    First number: 10
    Second number: 20

    Output:
    First number: 20
    Second number: 10
 */

fun main() {
    println("Enter first number: ")
    var first = readLine()!!.toInt()
    println("Enter second number: ")
    var second = readLine()!!.toInt()

    println("Before Swap: \n" +
            "First number: $first \n" +
            "Second number: $second \n")

    var temporal = first
    first = second
    second = temporal

    println("After Swap: \n" +
            "First number: $first \n" +
            "Second number: $second")

}

main()