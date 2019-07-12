var counter = 0

do {
    counter += 2
    println("counting... $counter")
} while (counter < 20)


println()
println()


var brothers = 5

do {

    println("How many Brothers I have? ")
    val responder = readLine()!!.toInt()
    if (responder == brothers) {
        println("That's great, you know me")
    }

} while (responder != 5)
