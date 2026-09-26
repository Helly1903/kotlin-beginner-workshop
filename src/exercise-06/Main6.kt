
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
    Producto1.MostrarInformacion()
}