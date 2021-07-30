// Reapeat 
/*
In Kotlin repeat statement is used when a set of statements has to be executed N-number of times.
*/

fun main() {
    repeat(3) {
        println("Hello World")
    }
    
        repeat(3) { withIndex -> 
        println("Hello World $withIndex")
    }
}
