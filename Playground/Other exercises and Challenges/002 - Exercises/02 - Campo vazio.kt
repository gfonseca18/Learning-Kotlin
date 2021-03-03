/**
 * Empty vs blank
 
 */

fun main() {
    val name = "  "
    
    println("O texto esta") 
    // isEmpty verifica se o campo esta realmente vazio isso (com espaços em branco)
    // caso encontre algum espaço em branco assume bool para false
    println(name.isBlank()) 
    // isBlank verifica se o campo esta vazio isso (sem espaços em branco ou texto)
    // caso encontrem no meio dos espaços algo número ou letra o bool muda para false

}