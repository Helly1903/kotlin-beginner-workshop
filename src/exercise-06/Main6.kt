class Product(val nombre: String, val precio: Double, val cantidad: Int)

fun main() {
    val Producto1 = Product("Teclado", 80000.0, 14)
    println(Producto1.nombre)
}