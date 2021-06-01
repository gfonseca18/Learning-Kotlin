
// ArrayLists is like mostly array in another languages (swift, Python)
/*

The Big differece between Array and ArrayList is in ArrayList you can print
elements without method for loop, and no don't need to specify the size

 */


val list = arrayListOf<String>("Uige", "Benguela", "S. Paul", "Luanda")
list.add("B13") // Add new element
list.forEach {
        println(it)
}


println()
        println("-===- BLANK SPACE -===")
println("Mutables List")
println()

// MUTABLES LIST

val movies = mutableListOf<String>("Matrix", "Rambo", "Exterminator 2", "Bad Boys")
for (item in movies) {
        println(item)
}

// Get the positions
movies.slice(1..3 ) // only get elements from 1 to 3
movies.first() // Get the first element
movies.last() // Get the last element
movies.size
movies.sort() // Order the list A-Z
println(movies.joinToString("---"))


println()
println("-===- BLANK SPACE -===")
println("Printing list with index")
println()

for ((index, name) in movies.withIndex()) {
        println("$index, $name") // Printing list with index
}

//
movies.forEach {
        println(it)
}