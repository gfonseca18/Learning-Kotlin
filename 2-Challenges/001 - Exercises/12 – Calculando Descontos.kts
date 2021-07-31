/*
12 – Calculando Descontos
Exercício Python 012: Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.

*/

fun main() {
    val article = 100
    val discount = 50
    val sum = article * discount / 100
    println(
        """
        The article cost ${article} kz with ${discount} off
        Value of discount is ${sum} kz.
        """)
}

main()