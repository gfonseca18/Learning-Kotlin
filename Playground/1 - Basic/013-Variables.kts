fun variables(){
    var name = "Jonhny"
    var last = "Cage"
    var gestFirstName = "José"
    var gestLastName = "Lukaku"

    println("First name: " + name + ", Last name: " + last )
    println("Guest Name: $gestFirstName $gestLastName")
}

variables()

// immutable Variables

fun immutableVariables() {
    var name = "Tyson"
    val year = 1950 // val is a constant "CAN CHANCE is like variable Let in Swift lang

    println("Actor name: $name, born on $year")
}

immutableVariables()