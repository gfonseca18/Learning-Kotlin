// When Statement


fun main(age: Int) {

    when(age) {
        in 0..10 -> println("Criança")
        in 11..17 -> println("Adolecente")
        in 18..20 -> println("Adulto")
    }
}

main(14)