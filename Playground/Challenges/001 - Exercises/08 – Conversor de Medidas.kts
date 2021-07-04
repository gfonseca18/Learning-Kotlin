/*
08 – Conversor de Medidas
Exercício Python 008: Escreva um programa que leia um valor em metros, e o exiba convertido em centímetros e milímetros.

 */

println("Digite o valor em metros que deseja converter: ")
val meter = readLine()!!.toFloat()

fun main() : String {
    return "$meter m equivale a ${meter * 100} cm "
}

main()