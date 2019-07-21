class House(type: String, price: Double, yearBuild: Int, owner: String){
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
print("""
    This is ${place.type} cust ${place.price} Build in ${place.yearBuild}, 
    propriet of ${place.owner}
""")