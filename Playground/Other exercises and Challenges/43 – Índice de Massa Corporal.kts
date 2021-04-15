/*

43 – Índice de Massa Corporal
Exercício Python 043: Desenvolva uma lógica que leia o peso e a altura de
uma pessoa, calcule seu Índice de Massa Corporal (IMC)
e mostre seu status, de acordo com a tabela abaixo:

- IMC abaixo de 18,5: Abaixo do Peso
- Entre 18,5 e 25: Peso Ideal
- 25 até 30: Sobrepeso
- 30 até 40: Obesidade
- Acima de 40: Obesidade Mórbida

 */

fun main() {
    println("== Índice de Massa Corporal ==")
    println("> Digite o seu peso: ")
    val weight = readLine()!!.toFloat()

    when (weight) {
        in 0F..18.99F -> println("Você esta abaixo do peso ideal")
        in 19F..29.99F -> println("Você esta com peso Ideal")
        in 26F..39.99F -> println("Você esta Sobrepeso 😩 ")
        in 31F..49.99F -> println("Você esta Obeso muito cuidado ")
        in 41F..99.99F -> println("Obesidade Mórbida")

        else -> println("Contacte o seu médico")
    }


}

main()