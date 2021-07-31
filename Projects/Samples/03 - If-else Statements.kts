fun driver() {
    println("Digite a sua idade: ")
    val age = readLine()!!.toInt() // Convert to String to Int()
    if (age <= 17) {
        println("Es muito jovem para conduzir")

    } else if (age >= 18) {
        println("Já es adulto!")
        Thread.sleep(1000)
        println("Bem-vindo ao clube parceiro")
    }

    Thread.sleep(2000)
    println("Te vejo na estrada")
}

driver()