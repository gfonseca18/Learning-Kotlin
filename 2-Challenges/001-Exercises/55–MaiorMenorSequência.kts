/*
Exercício Python 055:
[x] Faça um programa que leia o peso de cinco pessoas.
[x] No final, mostre qual foi o maior e o menor peso lidos.

 */

fun main() {
    var weightPeople = arrayListOf<Float>()
    while (weightPeople.count() < 5.0) {
        println("Digite o seu peso a seguir dos seus amigos >:")
        val weight = readLine()!!.toFloat()
        weightPeople.add(weight)
    }

    println(" <: A pessoa mais pesada tem ${weightPeople.maxOrNull()} " +
            "kz o mais leve tem ${weightPeople.minOrNull()} Kg")
}

main()