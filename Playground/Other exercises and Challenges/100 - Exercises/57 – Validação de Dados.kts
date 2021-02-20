/*
57 – Validação de Dados
Exercício Python 057: Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores 'M' ou 'F'.
Caso esteja errado, peça a digitação novamente até ter um valor correto.

 */

fun main() {
    println("Qual é o seu genero? [M/F]")
    var genere = readLine()!!.toString().toLowerCase()

    while (genere[0].toString() != "m" && genere[0].toString() != "f") {
        println("Dados invalidos!, tente novamente: ")
        genere = readLine()!!.toString().toLowerCase()
    }
    println("Sexo ${genere.capitalize()} registrado com sucesso")
}

main()