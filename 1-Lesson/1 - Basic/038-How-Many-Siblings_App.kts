/*

The user is prompted with a question
The user has to enter to enter an answer
If the answer is incorrect, then the user is propmted with the answer
Else the application terminates

*/

var isTrue = false

do {
    println("How many siblings does Paulo have? ")
    var answer: Int? = readLine()!!.toInt()

    when(answer){
        12 -> {
            println("Correct")
            isTrue = true
        } else -> println("You're wrong \n")
    }

} while(isTrue == false)