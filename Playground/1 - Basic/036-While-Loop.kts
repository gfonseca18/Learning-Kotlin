import kotlin.math.max

var counter = 0
while (counter <= 10) {
    counter += 2
    println("counting... $counter")
    if (counter == 6) {
        println("Continue $counter detected")
        continue
    }
}

