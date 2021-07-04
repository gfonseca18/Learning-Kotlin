/*
27 – Primeiro e último nome
Exercício Python 027: Faça um programa que leia o nome completo de uma pessoa, mostrando em seguida o primeiro
e o último nome separadamente.

 */

fun main() {
    println("Digite o seu primeiro nome: ")
    val firstN = readLine()!!.toString()

    println("Digite o seu último nome: ")

    val secondN = readLine()!!.toString()
    println("Hello! $firstN  \n $secondN")
}

main()