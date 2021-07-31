import java.io.FileWriter

fun main(){
    println("Enter a message: ")
    val message = readLine().toString()
    if (message.equals("")) {
        println("Please enter a message")
    }

    try {
        val file = FileWriter("065-File.txt", true)
        file.write(message + " \n")
        file.close()

    } catch (ex: Exception) {
        println("Exception: $ex")
    }

}

main()
