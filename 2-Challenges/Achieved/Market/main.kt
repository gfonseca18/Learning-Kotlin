import classes.Products

fun main(arguments: Array<String>) {
    println("Por favor informe os produtos que deseja >: ")
    if (arguments.isEmpty()) {
        println("Informe produtos da lista que deseja comprar: ")
        return
    }

    val itemAvailable = arrayOf(Products("arroz", 35.10),
        Products("Azeite", 200.2),
        Products("Sugar", 25.00),
        Products("Carne", 20.03)
    )

    // Filtra a lista com os argumentos e ignora uppercase e lowercase
    val itemsSelectedAvailable = itemAvailable.filter {
        products -> arguments.any {arguments -> arguments.equals(products.name, ignoreCase = true)

        }
    }

    for (items in itemsSelectedAvailable) {
        println(items.showProductsData())
    }

}
