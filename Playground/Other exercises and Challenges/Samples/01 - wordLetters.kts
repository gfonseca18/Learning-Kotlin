/*

Crie uma funçāo que recebe uma String e retorne na tela a quantidade de caracteres.
Resultado esperado: A String - PARAMETRO possui X Caracteres.
Considere que o PARAMETRO é o nome do parâmetro recebido pela funçāo.

*/

fun main (word: String): String {
    var phase = "Hey the word ${word.length} letters"
    println(phase)

    return phase
}

main("John Rambo")