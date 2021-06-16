/*
Exercício de Kotlin 04:** Escreva um programa que recebe o nome e a idade de acordo com uma lista de convidados
valide se a pessoa está na lista e se é maior de idade, retornar a mensagem de acordo as
validações feitas.
 */

fun main() {
    println("Informe o nome do convidado")
    val name = readLine()!!

    if (name.isNullOrEmpty() || name.isNullOrBlank()) {
        println("O nome informado nāo é valido")
        return
    }

    println("Informe a idade do convidado")
    val age = readLine()?.toIntOrNull()

    if (age == null || age <= 0) {
        println("A idade informada nāo é valido")
        return
    }

    var guest = false
    when(name) {
        "Kakulu" -> guest = true
        "Alex" -> guest = true
        "Lisa" -> guest = true
        else -> guest = false
    }

    if (guest && age >= 18) {
        println("Bem-vindo a Festa!")
    } else if (guest == false){
        println("Você nāo esta na lista")
    } else {
        println("Você é menor de idade para participar desta festa")
    }

}

main()