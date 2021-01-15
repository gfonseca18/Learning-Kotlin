/*
50 – Soma dos pares
Exercício Python 050: Desenvolva um programa que leia seis números inteiros e mostre
a soma apenas daqueles que forem pares.
Se o valor digitado for ímpar, desconsidere-o.
 */


fun main() {
    val numbers = mutableListOf<Int>()
    while (true) {
        println("Digite um numero: ")
        val number = readLine()!!.toInt()
        numbers.add(number)
        if (numbers.size > 5) {
            println("Numeros digitados: $numbers")
            break
        }
    }
}

main()