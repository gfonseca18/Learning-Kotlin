/*
50 – Soma dos pares
Exercício Python 050: Desenvolva um programa que leia seis números inteiros e mostre
a soma apenas daqueles que forem pares.
Se o valor digitado for ímpar, desconsidere-o.
 */


fun main() {
    val listOfNumbers = mutableListOf<Int>()

    while (true) {
        println("Digite um número: ")
        val number = readLine()!!.toInt()
        listOfNumbers.add(number)

        if (listOfNumbers.size > 5) {
            if (number % 2 == 0) {
                listOfNumbers.add(number)
                listOfNumbers.removeLast()
                println("A soma dos números PARES na lista: ${listOfNumbers.sum()}")
                break
            }
        }
    }
    println("Números digitados $listOfNumbers")
}

main()