var country = "Angola"      // Global variable

fun province(name: String){
    val greeting = "Welcome to"    // Local variable
    println("$greeting $name - $country")
}

province("Uige")
province("M'banza Congo")
province("Cabinda")
province("Cunene")

/*
    You can't use local variables outside function
    except global variables
 */