/*
33 – Maior e menor valores
Exercício Python 033: Faça um programa que leia três números e
mostre qual é o maior e qual é o menor.
 */

fun main() {
    val numbList = mutableListOf<Int>()
    println("Primeiro número: ")
    val numb1 = readLine()!!.toInt()
    numbList.add(numb1)
    println("Segundo número: ")
    val numb2 = readLine()!!.toInt()
    numbList.add(numb2)
    println("Terceiro número:")
    val numb3 = readLine()!!.toInt()
    numbList.add(numb3)
    println("Your numbers: $numbList")
    
}

main()