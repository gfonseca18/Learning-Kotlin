/*
19 – Sorteando um item da Lista
Exercício Python 019: Um professor quer sortear um dos seus quatro alunos para apagar o quadro.
Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
 */


fun main() {
    
    val students = arrayListOf("Anna", "Carlos", "Antho", "Eli")
    val randomized = students.random()
    println("O professor escolheu: $randomized")
    
}

main()