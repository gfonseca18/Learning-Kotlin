/**
Exercício de Kotlin 02: - Faça um programa que pergunte o nome de um funcionário, o seu programa deve identifique se o campo "nome do funcionário" estiver vazio com espaços em branco ou não.
Caso o usuário tenham digitado mostre o nome na saída do programa.
 */

fun main() {
    println("Escreva o nome do funcionário: ")
    val name = readLine()!!.toString()
    println("Bem-vinda $name")

    if (name.isEmpty()) {
        println("Nenhum texto digitado [isEmpty()]")
    } else if (name.isBlank()) {
        println("Nenhuma palavra digitado somente espaços em branco [isBlank()]")

    }
}

main()