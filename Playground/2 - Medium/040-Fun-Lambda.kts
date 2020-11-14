var square: (Int) -> Int = {
    it * it
}

var result = square(5)
println(result)

var calculate = { a: Int, b: Int -> Int
    a + b
    // Lambda receive function with parameters
}

var result2 = calculate(30, 30)
println(result2)