fun pers(name: String, last: String) : String {
    return "$name $last"
}

println(pers("James", "Bound"))


// Other Double
println()

fun mult(numb: Int, numb2: Int) : Double {
    val result = numb * numb2
    return result.toDouble()
}

println(mult(9, 90))


// Other with Integer
println()


fun integer(a: Int, b: Int) : Int {
    var sum = a + b
    return sum
}

println(integer(100, 500))


// Boolean
println()


fun bool(sex: Boolean, age: Int) : Boolean {
    if (sex == true && age >= 18) {
        println("Welcome man")
        return true
    }

    else if (sex == false && age <= 18 || age >= 18) {
        print("We need men for this job")
        return false

    } else {
        println("Too young")
        return false
    }
}

bool(true, 25)