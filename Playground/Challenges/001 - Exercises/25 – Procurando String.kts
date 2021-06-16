/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 * 
 * 
25 – Procurando String
Exercício Python 025: Crie um programa que leia o nome de uma pessoa e diga se ela
tem "SILVA" no nome.
 */
 
fun main() {
    val name = "Bernardo Andre".toUpperCase()
    
    if (name.contains("Silva".toUpperCase())) {
        println("O seu nome tem Silva ✅")
    } else {
        println("O seu nome não tem Silva ❌")
    }
    
    println("Nome digitado: $name")
}
