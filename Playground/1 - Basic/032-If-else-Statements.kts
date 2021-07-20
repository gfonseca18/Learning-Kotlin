/*

032 If-else Statements and Conditional operators

if ...
else ...


 */

println("==== == Drive License Program == ====")

var userOld = 19
if (userOld >= 18) {
    println("Welcome to the program")

} else if (userOld <= 18){
    println("You are too young")
}

println()



// Condicional expression
val num = -8
val result = if (num > 0) "Positive"
else "Negative"
println(result)

println()

println("=== My age ===")

val born = 1989
val actual = if (2021 - born >= 18) "You're old"
else "You're young"
println(actual)