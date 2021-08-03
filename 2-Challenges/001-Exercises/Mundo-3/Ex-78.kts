/*

Exercício Python 078:
Faça um programa que leia 5 valores numéricos [x]
e guarde-os em uma lista.[x]
No final, mostre qual foi o maior e o menor valor digitado e as suas respectivas posições na lista. [x]

*/

fun main() {

   val list = mutableListOf<Int>()
   rep
      println("Digite o ${it +1}º número >: ")
      val number = readLine()!!.toInt()
      list.add(number)
   }
   println("<: Maior número digitado: ${list.maxOrNull()} \n Menor número digitado: ${list.minOrNull()}")
}

main()