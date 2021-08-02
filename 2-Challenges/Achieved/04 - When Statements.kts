/*

When can also be used as an expression.
If it is used as an expression, the value of the satisfied branch becomes the value of the overall
expression.

 */

var grade = 90
var result = when {
    grade < 50 -> "Failed"
    grade in 50..79 -> "Good"
    grade > 80 -> "Awesome!"
    else -> "Unknown"
}

println(result)

println()
//
println()


fun speed() {
    // Variable inline
    when (90.0F){
        in 00.00..69.99 -> println("Normal")
        in 70.00..89.99 -> println("Cuidado")
        90.00F -> println("Perigo de MORTE")
        else -> {
            println("Default")
        }
    }
}

speed()