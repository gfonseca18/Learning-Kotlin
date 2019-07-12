/*

The user is prompted with a question
The user has to enter to enter an answer
If the answer is incorrect, then the user is propmted with the answer
Else the application terminates

*/

var brothers = 5

do {

    println("How many Brothers I have? ")
    val responder = readLine()!!.toInt()
    println("Try Again")
    if (responder == brothers) {
        println("Thank you")
    }

} while (responder != 5)
