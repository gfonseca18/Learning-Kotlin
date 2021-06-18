fun main() {
    println("The first number")
    val first = readLine()!!.toInt()
    println("The second number")
    val second = readLine()!!.toInt()
    println("The third number")
    val third = readLine()!!.toInt()

    if (first > second && first > third)
        println("First A")

    else if (second > third)
        println("B")
    else
        println("C")

}


main()