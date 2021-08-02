/*

Exercício Python 078:
Faça um programa que leia 5 valores numéricos [x]
e guarde-os em uma lista.[x]
No final, mostre qual foi o maior e o menor valor digitado e as suas respectivas posições na lista.

*/

fun main() {
    val list = mutableListOf<Int>()
    repeat(1+5) {
        println("Digite o ${it}º número ")
        val number = readLine()!!.toInt()
        list.add(number)
    }
    println(list)
}

main()