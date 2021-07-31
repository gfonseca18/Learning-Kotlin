import java.io.FileWriter

fun main() {
    var message = "Bonus message (Message Content) 2"

    try {
        var file = FileWriter("064-File.txt")
        file.write(message)
        file.close()

    } catch (ex: Exception){
        println("Exception $ex")
    }
}

main()