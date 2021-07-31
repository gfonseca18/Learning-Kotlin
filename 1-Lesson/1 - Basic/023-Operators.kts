// Sum numbers (+)

var a = 100
var b = 90

println("The sum of a and b is: ${a + b}")


// Subtraction numbers (-)

fun subst(){
    println("Subtraction of A and B is: ${a - b}")
}

subst()


// Multiplying numbers (*)

fun multiplying(){
    println("The multipl. of A and B is: ${a * b}")
}

multiplying()


// Division numbers (/)

fun division(){
    println("The division of A and B is: ${a / b.toFloat()} B. Was converted to float() ")

}

division()


// Remainder division (%) Resto da divisāo

fun remainder(){
    println("The remainder of A and B is: ${a % b.toFloat()} B. Was converted to float() ")
}

remainder()


// Incrementing numbers

fun incrementing(){
    a += 2
    println("Letter A: Was Incrementing twice, it's now: ${a} B: Was not ${b}")
}

incrementing()

// Decrementing numbers

fun decrementing(){
    b -= 2
    println("Letter B: Was Decrementing twice, it's now: ${b} B: Was not ${a}")

}

decrementing()