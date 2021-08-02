/*

54 – Grupo da Maioridade
Exercício Python 054:
[x] Crie um programa que leia o ano de nascimento de sete pessoas.
[x] No final, mostre quantas pessoas ainda não atingiram a maioridade e
[x] quantas já são maiores.

 */

// - [] Refactor

fun main() {
    var peopleList = mutableListOf<Int>()
    var youngList = mutableListOf<Int>()
    var adultList = mutableListOf<Int>()

    while (peopleList.count() < 3) {
        println("Em que ano você nasceu? >: ")
        var peopleCount = readLine()!!.toInt()
        peopleList.add(peopleCount)

    }
    for (item in peopleList) {
        if (2021 - item <= 17) {
            youngList.add(item)
        } else {
            adultList.add(item)
        }
    }


    println("GERAL $peopleList")
    println("Têm ${youngList.size} Menores")
    println("Têm ${adultList.count()} Maiores")

}

main()