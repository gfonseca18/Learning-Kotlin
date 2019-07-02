// Kotlin é uma linguagem totalmente oriedada a objectos

fun sayHello(){
    println("Hello World")
    println("I'm loving KOTLIN lang ")
}

sayHello()


// Hello With parameters

fun sayHello(a: String){
    println("Hi " + a)  // Other concatenate form
}

sayHello("Baby")

fun greeting(b: String, c: String){
    println("Hello! $b and $c")  // Other concatenate form
}

greeting("Simon", "Ana")


// With Default parameters (Value)

fun greeting2(d: String, e: String = "Good morning"){
    println("$e, $d")
}

greeting2("Dr. Swift")
