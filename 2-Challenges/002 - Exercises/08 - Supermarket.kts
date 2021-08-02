/*
Exercício de Kotlin 08:

— Escreva um programa que recebe alguns produtos
como argumentos, validar se esses produtos estão na lista de itens disponíveis no
supermercado.
Caso estejam. Avisar ao utilizador quais produtos tem e quais nāo tem e por último,
exibir a lista dos produtos disponíveis ordenados por ordem alfabética do mercado,
para que o utilizador possa pedir na próxima vez.

 */

fun supermarket(arguments: Array<String>) {

    // Validar produtos
    if (arguments.isEmpty()) {
        println("Por favor informe a sua lista de compras para verificarmos a disponibilidade")
        return
    }

    // Produtos disponivel no supermercado
    val availableInSupermarket = arrayOf("Pāo", "Bolo", "Peixe", "Leite", "Queijo", "Feijāo",
        "Arroz", "Frescos", "Cerveja", "Vinho", "Biscoito", "Banana", "Maçā", "Pera")

    // Filtrar por produtos disponivel
    val produRequestAvailable = arguments.filter { requested -> availableInSupermarket.contains(requested) }
    for (requestAvailable in produRequestAvailable) {
        println("[] $requestAvailable - Disponivel")
    }

    // Filtrar por produtos nāo disponivel
    val produtoRequestNotAvailable = arguments.filter { notRequested -> !availableInSupermarket.contains(notRequested) }
    for (noResquest in produtoRequestNotAvailable) {
        println("[x] $noResquest - Indisponivel")

    }
    println()
    println("==== Produtos disponíveis em Stock ==== \n")

    val organized = availableInSupermarket.sortedBy { product -> product }
    organized.forEach { product -> println("Confiram produtos disponiveis: $product") }

}

supermarket(arguments = arrayOf("Arroz", "Picole", "Queijo", "Agua mineral", "Pāo francês"))