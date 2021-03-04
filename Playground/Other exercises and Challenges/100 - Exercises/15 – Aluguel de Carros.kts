/*
15 – Aluguel de Carros
Exercício Python 015: Escreva um programa que pergunte a quantidade de Km
percorridos por um carro alugado e a quantidade de dias pelos
quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro
 custa R$60 por dia e R$0,15 por Km rodado.

 */
fun main() {
    val kmPrice = 0.15
    val dayPrice = 60

    println("Quantos km percorreu a viatura: [12.3] km")
    val km = readLine()!!.toDouble()
    println("Por quantos dias a viatura ficou alugada: ")
    val days = readLine()!!.toInt()

    println("Tem a pagar ${(days * dayPrice) + (km * kmPrice)} Kz pela uso da viatura")

}

main()