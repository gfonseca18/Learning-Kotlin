/*

39 – Alistamento Militar
Exercício Python 039:
Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com a sua idade, se ele ainda vai se
alistar ao serviço militar, se é a hora exata de se alistar ou se já passou do tempo do alistamento.
Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.

 */

fun main() {
    println("Informe o seu ano de nascimento: ")
    val year = readLine()!!.toInt()
    when(year) {
        in 1900..2001 -> println("Já passou o seu tempo de alistamento a ${(2020 - year) - 18} anos")
        in 2002..2020 -> println("Estas no prazo de alistamento faltando ${18 - (2020 - year)} anos")

        else -> println("Otherwise")
    }
}

main()