/*
* 47 – Contagem de pares
Exercício Python 047: Crie um programa que mostre na tela todos os números pares que estão no intervalo entre 1 e 50
* */

fun countable() {
    for (count in 0 until 51) {
        if (count % 2 == 0) {
            println("$count é par")
        } else {
            println("$count é impar")
        }
    }
}

countable()