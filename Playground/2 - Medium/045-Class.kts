class House (type: String, price: Double, yearBuild: Int, owner: String){
    var type: String? = null
    var price: Double? = null
    var yearBuild: Int? = null
    var owner: String? = null

    init {      // Inicialize proprieties
        this.type = type
        this.price = price
        this.yearBuild = yearBuild
        this.owner = owner
    }
}

var place = House("Quintal", 5.000, 1980, "Angola State" )
print(
        """
        This is ${place.type} cust ${place.price} Build in ${place.yearBuild}, 
        propriet of ${place.owner}
"""
)

// Change Object

place.type = "Bank"
place.price = 900.0000
place.yearBuild
place.owner = "GPL"


print(
        """
        This is ${place.type} cust ${place.price} Build in ${place.yearBuild}, 
        propriet of ${place.owner}
"""
)


println("====== ======== ======= ===== ====")



// Other Class



class Coin (name: String, value: Int, color: String, size: Double){
    var name: String? = null
    var value: Int? = null
    var color: String? = null
    var size: Double? = null

    init {
        this.name = name
        this.value = value
        this.color = color
        this.size = size
    }
}

var kz_50 = Coin("Kwanza", 50, "Prateado", 5.5)

println(
        """
                Angola Coin
            -------------------
            Name: ${kz_50.name} 
            Value: ${kz_50.value} Kz
            Color: ${kz_50.color}
            Size: ${kz_50.size} mm

        """.trimIndent()
)

var kz_100 = kz_50
kz_100.name = "Real"
kz_100.value = 1
kz_100.color = "Brown"
kz_100.size = 2.0



println(
        """
                Brasil Coin
            -------------------
            
            Name: ${kz_100.name}
            Value: ${kz_100.value} R$
            Color: ${kz_100.color}
            Size: ${kz_100.size} mm
        """.trimIndent()
)