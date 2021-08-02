package classes

class Products (val name: String, val price: Double) {

    fun showProductsData() : String {
        return "Nome de produto: $name, valor Kz $price"
    }
}