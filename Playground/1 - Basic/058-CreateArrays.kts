var array = emptyArray<String>()  // Empty Array of String

var a = arrayOf(1, 3, 5, 5, Boolean, 12.30, true) // Mix Array


// Array with size

var array2 = Array<Int>(5){2}   // The element is number 2, 5 is the size (lenth)of array
array2[0] = 100 // Change the array element by Index
println(array2[0])



var  b = arrayOf("B", "V", 32, Boolean, 32,2, false)
b += 20     // Add element

for (i in 0..5){
    println("$i of 8")
}

println(b.count()) // Get the size of array

// Interator

val iterador = (0..5).iterator()

iterador.forEach {
    println("The element is $it")
}
