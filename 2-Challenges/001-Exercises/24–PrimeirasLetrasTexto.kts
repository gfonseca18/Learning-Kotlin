/*

25 – Procurando String
Exercício Python 025:
Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome.

*/

fun main() {
    println("Digite o nome para verificar se contém o nome ''SILVA'' ")

    val name = readLine()!!.toString().uppercase()
    if (name.isEmpty() || name.isBlank()) {
        println("Por favor verique o nome digitado")
        return
    }
    if (name.contains("SILVA")) {
        println("Bingo! O nome tem SILVA")
    } else {
        println("Nop! O nome nāo tem SILVA")
    }
}

main()