enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun africaMgs() {
    println("We have the power to chance the world")
}

fun toGo (gps: Direction) {
    when (gps) {
        Direction.NORTH -> println("In North the Things go Well")
        Direction.SOUTH -> africaMgs()
        Direction.EAST -> println("We can try")
        Direction.WEST -> println("Noel is not HERE Oh oh oh")
    }
}

toGo(Direction.SOUTH)