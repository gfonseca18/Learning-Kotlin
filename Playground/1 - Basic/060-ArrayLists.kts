
// Array Lists is like mostly array in another languages (swift, Python)
/*

The Big differece between Array and ArrayList is in ArrayList you can print
elements without method for loop, and no don't need to specify the size

 */


var lista = ArrayList<String>()
// Add elements
lista.add("Alibaba")
lista.add("Benguela")
lista.add("Paul")
lista.add("Luanda")

println("${lista.get(2)} has Index 2") // Print element by Index
println(lista)

// Removing elements
lista.remove("Paul")
println(lista)

//


println()
        println("BLANK SPACE")
println()

// MUTABLES LIST

val movies = mutableListOf<String>()
movies.add("Matrix")
movies.add("John Rambo")
movies.add("Exterminator 2")
movies.add("The last of Us")
movies.add("X-Man")
println(movies)

movies.first()
movies.last()
movies.size
movies.slice(1..3 ) // only get elements from 1 to 3
movies.contains("X-Man")
movies.sort()
movies.joinToString(":")


for ((index, name) in movies.withIndex()) {
        println("$index, $name") // Print list with index
}