/*

30 – Par ou Ímpar
Exercício Python 030: Crie um programa que leia um número inteiro e mostre
na tela se ele é PAR ou ÍMPAR.

 */

fun numbers(a: Int) {
    if (a % 2 == 0) {
        println("Número par - $a")
    } else {
        println("Número ímpar - $a")
    }
}

numbers(55)