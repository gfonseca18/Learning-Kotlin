/***

46 – Contagem regressiva
Exercício Python 046: Faça um programa que mostre na tela uma contagem regressiva para o estouro de fogos de artifício,
indo de 10 até 0, com uma pausa de 1 segundo entre eles.

 */


fun fire() {
    for (i in 10 downTo 0) {
        Thread.sleep(1000)
        println(i)
    }
    println("BUMMM BUM")
    print("Success")
}

fire()