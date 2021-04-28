
/*

44 – Gerenciador de Pagamentos
Exercício Python 044: Elabore um programa que calcule o valor a ser pago por um produto,
considerando o seu preço normal e condição de pagamento:

- à vista dinheiro/cheque: 10% de desconto
- à vista no cartão: 5% de desconto
- em até 2x no cartão: preço formal
- 3x ou mais no cartão: 20% de juros

 */
val ipadPro = 1000
fun main() {
    println("–+ Gerenciador de Pagamentos –+ \n")
    println("\n" +
            "[1] - à vista dinheiro/cheque: 10% de desconto \n" +
            "[2] - à vista no cartão: 5% de desconto \n" +
            "[3] - em até 2x no cartão: preço formal \n" +
            "[4] - 3x ou mais no cartão: 20% de juros ")


    println(" - Sua formas de pagamentos - ")
    val payment = readLine()!!.toInt()

   option_1()
   // option_2()
   // option_3()
    option_4()

    when (payment) {
        1 -> println(option_1())
        2 -> println(option_2())
        3 -> println(option_3())
        4 -> println(option_4())

        else -> println("Opçāo inválida")
    }

}

fun option_1(discount: Int = 10) : String {
    val sale = ipadPro * discount / 100
    return "iPad Pro custando ${ipadPro} kz \n " +
        "Opçāo [1]: - à vista dinheiro/cheque - \n" +
            " Preço final com 10% de desconto ${sale}"
}

fun option_2(discount: Int = 5) : String {
    val sale = ipadPro * discount / 100
    return "iPad Pro custando ${ipadPro} kz \n " +
            "Opçāo [2]: - à vista no cartão - \n" +
            " Preço final com 5% de desconto ${sale}"
}

fun option_3() : String {
    return "iPad Pro custando ${ipadPro} kz \n " +
            "Opçāo [3]: - em até 2x no cartão - \n" +
            " preço formal sem desconto"
}

fun option_4() : String {
    return "iPad Pro custando ${ipadPro} kz \n " +
            "Opçāo [4]: - 3x ou mais no cartão 20% de juros - "
}

main()