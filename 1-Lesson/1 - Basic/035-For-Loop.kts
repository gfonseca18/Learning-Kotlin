for (i in 1..5) {
    println("$i Hello World!")
}

//

println()

fun control(arguments: Array<String>) {
    for (indice in 0 until arguments.size)
        println("Percorrido os argumentos: posiçāo $indice valor: ${arguments[indice]}")
}
control(arguments = arrayOf("Miss", "Petroleo", "Gas", "Lion", "Loves"))


//

println()

for (item in 0..15) {
    if (item % 2 == 0) {
        println("$item is divisible by 2")
    } else {
        println("$item isn't divisible by 2")
    }
}

println()
println("===== === Loop for with steps == =====")


// "Loop for with steps"

println("Loop for with steps")

fun loopStep() {
    for (i in 1..20 step 2 ) {
        println(i)
    }
}

loopStep()


println()
println("===== === Loop for with downTo == =====")


fun loopDown() {
    for (i in 10 downTo 3) {
        println(i)
    }
}

loopDown()