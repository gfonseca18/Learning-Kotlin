// Null safety - segurança contra vazios

/*
- Kotlin nāo compila onde tem as variaveis nāo inicializadas
- Por patrāo o Kotlin nāo permite a declaraçāo de variaveis null

 */

//val age: Int
//println(age) // error: variable 'age' must be initialized
//val name: String = null // error: null can not be a value of a non-null type String


// Kotlin aceita declarações com sinal ? que indica a explitaçāo

var ghost: String? = null
ghost = "Midnigth"
println(ghost) // Midnigth

var guestHouse: String? = "                                                                 "
guestHouse = "Write house"

guestHouse?.let {
    println("== Hi $it ==")
}