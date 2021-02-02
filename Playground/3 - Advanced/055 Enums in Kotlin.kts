// Enums Classes = Allow us to represent collection of information "Fixed or static information"

enum class  Suits {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS

}

fun main() {
    val cardPlay = Suits.DIAMONDS
    val cardPlay2 = Suits.CLUBS

    if (cardPlay == Suits.DIAMONDS) println("You're doing great!")
    if (cardPlay2 == Suits.CLUBS) println("Hello there! Things are not so well")
}

main()