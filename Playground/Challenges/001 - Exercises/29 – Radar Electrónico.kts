/*
29 – Radar Electrónico
Exercício Python 029: Escreva um programa que leia a velocidade de um carro.
Se ele ultrapassar 80Km/h, mostre uma mensagem dizendo que ele foi multado.
A multa vai custar R$7,00 por cada Km acima do limite.

 */

fun main() {
    println("Digite a velocidade do veiculo: ")
    val speed = readLine()!!.toFloat()
    
    when (speed) {
        in 00.00..69.99 -> println("Velocidade de segurança")
        in 69.99..80.99 -> println("Velocidade Normal")
        in 81.00..299.99 -> println("Você foi multado por excesso de velocidade deverá pagar ${(speed - 80.00) * 7} kz")

        else -> {
            println("= Contacte um operator =")
        }
    }
}

main()