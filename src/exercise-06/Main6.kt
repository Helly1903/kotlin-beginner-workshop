
class Product(val nombre: String, val precio: Double, val cantidad: Int) {

    fun ValorTotalInventario(): Double {
        return precio * cantidad
    }

    fun MostrarInformacion() {
        println("Producto: $nombre | Precio: $precio | Cantidad: $cantidad | Valor Total: ${ValorTotalInventario()}")
    }
}

fun main() {
    val Producto1 = Product("Teclado", 80000.0, 14)
    val Producto2 = Product("Mouse", 30000.0, 17)
    val Producto3 = Product("Monitor", 500000.0, 3)

    Producto1.MostrarInformacion()
    Producto2.MostrarInformacion()
    Producto3.MostrarInformacion()
}