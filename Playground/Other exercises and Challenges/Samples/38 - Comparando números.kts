/*
38 – Comparando números
Exercício Python 038: Escreva um programa que leia dois números inteiros e compare-os.
mostrando na tela uma mensagem:

- O primeiro valor é maior
- O segundo valor é maior
- Não existe valor maior, os dois são iguais
 */

fun main() {
    println("Escreva o primeiro número: ")
    val first = readLine()!!.toInt()
    println("Escreva o segundo número: ")
    val second = readLine()!!.toInt()

    if (first > second) {
        println("O primeiro número é maior")
    } else if (first < second) {
        println("O segundo número é maior")
    } else if (first == second) {
        println("Não existe valor maior, os dois são iguais")
    } else {
        println("Default")
    }
}

main()