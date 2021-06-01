fun main(argument: Array<String>) {

    if (argument.isEmpty()) {
        println("Informe um argumento válido")
        return
    }

    val number = argument[0].toIntOrNull()  // Pega um valor ou um valor nulo (vazio sem argumentos)
    if (number == null) {
        println("O valor informado nāo é valido")
        return
    }
    println("O número digitado foi: $number")

    var soma: Int
    soma = number + number
    println("A soma do número + número é $soma")

}

main(argument = arrayOf<String>("20"))