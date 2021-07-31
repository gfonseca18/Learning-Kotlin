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

//

var lambda: () -> Unit = {
    println("Hello World")

    // Lambda function without return, that's why is Unit
}

lambda()