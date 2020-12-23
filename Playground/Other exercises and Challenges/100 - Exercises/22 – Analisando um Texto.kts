/*
22 – Analisando um Texto
Exercício Python 022: Crie um programa que leia o nome completo de uma pessoa e mostre:
- O nome com todas as letras maiúsculas e minúsculas.
- Quantas letras ao todo (sem considerar espaços).
- Quantas letras tem o primeiro nome.
 */

fun main() {
    println("Digite o seu nome: ")
    val name = readLine()!!.toString()

    println("Seu nome em maiúsculas $name".toUpperCase())
    println("Seu nome em minúsculas $name".toLowerCase())
    println("O seu nome tem no total ${name.length} caracteres") // Inclui os espaços

}

main()
