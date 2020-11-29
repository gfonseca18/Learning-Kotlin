/*
24 – Primeiras letras de um texto
Exercício Python 024: Crie um programa que leia o nome de uma cidade diga se ela começa ou não com o nome "SANTO".
*/

println("Digite o nome para verificar se contém o nome ''Santo'' ")
fun main() {

    var name = readLine()!!.toString().toUpperCase()
    if (name.contains("SANTO")) {
        println("Bingo")
    } else {
        println("Nop")
    }
}

main()