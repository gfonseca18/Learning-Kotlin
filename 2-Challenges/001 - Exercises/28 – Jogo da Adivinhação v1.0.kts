/*

28 – Jogo da Adivinhação v1.0
Exercício Python 028: Escreva um programa que faça o computador "pensar" em um número
inteiro entre 0 e 5 e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador.
O programa deverá escrever na tela se o usuário venceu ou perdeu.

 */

println("Digite um número e descobra o número escolhido pelo Computador: ")
var user = readLine()!!.toInt()
var cpu = (0..5).random()
if (user == cpu) {
    println("ACERTO!! Você digitou ${user} e o Computador ${cpu}")
} else {
    println("ERROU FEIO!! ")
}