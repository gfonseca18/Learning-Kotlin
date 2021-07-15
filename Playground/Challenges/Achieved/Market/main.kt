import classes.Products

fun main(arguments: Array<String>) {
    println("Por favor informe os productos que deseja :> ")
    if (arguments.isEmpty()) {
        println("Informe os productos da lista que deseja compprar: ")
        return
    }

    val itemAvailable = arrayOf(Products("arroz", 35.10))
}
