
/*

44 – Gerenciador de Pagamentos
Exercício Python 044: Elabore um programa que calcule o valor a ser pago por um produto,
considerando o seu preço normal e condição de pagamento:

- à vista dinheiro/cheque: 10% de desconto
- à vista no cartão: 5% de desconto
- em até 2x no cartão: preço formal
- 3x ou mais no cartão: 20% de juros

 */

println("Digite o preço final da compra: ")
val purchase = readLine()!!.toInt()

fun main() {

    println("–+ Gerenciador de Pagamentos –+ \n")
    println("\n" +
            "[1] - à vista dinheiro/cheque: 10% de desconto \n" +
            "[2] - à vista no cartão: 5% de desconto \n" +
            "[3] - em até 2x no cartão: preço formal \n" +
            "[4] - 3x ou mais no cartão: 20% de juros ")



    println(" - Sua formas de pagamentos - ")
    val payment = readLine()!!.toInt()

    when (payment) {
        1 -> println(option_1())
        2 -> println(option_2())
        3 -> println(option_3())
        4 -> println(option_4())

        else -> println("Opçāo inválida")
    }

}


fun option_1(discount: Int = 10) : String {
    val sale = purchase - (purchase * discount / 100)
    return "Compras no valor de ${purchase} kz \n " +
        "Opçāo [1]: - à vista dinheiro/cheque - \n" +
            " Preço final com 10% de desconto ${sale}"
}

fun option_2(discount: Int = 5) : String {
    val sale = purchase - (purchase * discount / 100)
    return "Compras no valor de ${purchase} kz \n " +
            "Opçāo escolhida Opçāo [2]: - à vista no cartão - \n" +
            " Preço final com 5% de desconto ${sale} Kz"
}

fun option_3() : String {
    val sales = purchase / 2
    return "Compras no valor de ${purchase} kz \n " +
            "Opçāo escolhida [3]: - em até 2x no cartão - \n" +
            "2x de $sales kz preço final $purchase Kz sem desconto"
}

fun option_4() : String {
    val sales = purchase + (purchase * 20 / 100)
    return "Compras no valor de ${purchase} kz \n " +
            "Opçāo escolhida [4]: - 3x ou mais no cartão 20% de juros - \n" +
            "Preço final $sales"
}


main()