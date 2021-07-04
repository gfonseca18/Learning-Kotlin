/*

25 – Procurando String
Exercício Python 025:
Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome.

*/

println("Digite o nome para verificar se contém o nome ''SILVA'' ")

fun main() {
    val name = readLine()!!.toString().toUpperCase()
    if (name.contains("SILVA")) {
        println("Bingo")
    } else {
        println("Nop")
    }
}

main()