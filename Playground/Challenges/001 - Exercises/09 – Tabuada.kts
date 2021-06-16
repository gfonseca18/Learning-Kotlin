/*
09 – Tabuada
Exercício Python 009: Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.

*/

var tab = 3

fun main() {
    println("Tabuada de $tab")
    for (i in 0..12) {
        println("$tab * $i = ${tab * i}")
    }
}
