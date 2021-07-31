/*
16 – Quebrando um número
Exercício Python 016: Crie um programa que leia um número Real qualquer pelo teclado
e mostre na tela a sua porção Inteira.
 */

fun main(){
    println("DIGITE UM NÚMERO:")

    val numb = readLine()!!.toFloat()
    println("Número Inteiro: ${numb.toInt()}")
    println("Número Real: $numb")
}

main()