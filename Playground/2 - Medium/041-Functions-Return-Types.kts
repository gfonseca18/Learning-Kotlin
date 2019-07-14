fun pers(name: String, last: String) : String {
    return "$name $last"
}

println(pers("James", "Bound"))


//
println()

fun mult(numb: Int, numb2: Int) : Double {
    val result = numb * numb2
    return result.toDouble()
}

println(mult(9, 90))