// Sequência de Fibonacci

var sum = 1
var lastSum = 0

repeat(10) {
    val temp = sum
    sum += lastSum
    lastSum = temp
    println("A Soma $sum Última soma $lastSum,")
}