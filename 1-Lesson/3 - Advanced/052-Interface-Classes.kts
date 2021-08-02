// Interface Classes = Classes that have methods without bodies

interface InputHanler {
    fun cliked()
}

class Phone: InputHanler {
    override fun cliked() {
        println("Call me on Phone")
    }
}

class Button: InputHanler {
    override fun cliked() {
        println("Button Clicked")
    }
}

fun main() {

    val phone = Phone()
    phone.cliked()

    val myButton = Button()
    myButton.cliked()
}

main()