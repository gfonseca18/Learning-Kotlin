for (i in 1..5) {
    println("$i Hello World!")
}

//

println()


for (item in 0..20) {
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
    for (i in 1..30 step 2 ) {
        println(i)
    }
}

loopStep()