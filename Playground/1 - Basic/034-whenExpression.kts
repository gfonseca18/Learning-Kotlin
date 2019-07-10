var age = 100
when (age) {
    17 -> println("17")
    18 -> println("18")
    19 -> println("19 Yep!")
    else -> {
        println("Nope above")
    }
}

println("==_==_==_== Guess the number Game ==_==_==_==")
println("Enter a number 1 to 10: ")
var guessNumber = readLine()!!.toInt()
when (guessNumber) {
    1 -> println("ohh nooo 🤓")
    2 -> println("ohh nooo 😔")
    3 -> println("ohh nooo  😖")
    4 -> println("ohh nooo MAYBE NEXT 😢")
    5 -> println("ohh YESSSS  😎 YOUU WIN")
    6 -> println("ohh CLOSE 😩 ")
    7 -> println("ohh 🥵 ")
    8 -> println("noo NOOO GOD MOTHER F*** ")
    9 -> println("ohh nooo 🤯 ")
    10 -> println("ohh f*** 🤬 ")

    else -> {
        println("$guessNumber is not between 1 and 10 😱 ")
        println("☠️")

    }
}

// Other

println()
println("=== ===== === === ")

println("")