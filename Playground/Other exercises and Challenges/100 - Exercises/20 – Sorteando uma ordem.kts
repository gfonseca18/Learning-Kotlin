/*
20 – Sorteando uma ordem
Exercício Python 020: O mesmo professor do desafio 019 quer sortear a ordem de apresentação de trabalhos dos alunos.
Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.

 */

fun main() {
    val students = mutableListOf<String>()

    repeat(4){
        println("Digite o nome aluno: ")
        var names: String = readLine()!!
        students.add(names)

    }

    println("== Ordem de apresentaçāo ==")
    println(students.sorted())
}

main()