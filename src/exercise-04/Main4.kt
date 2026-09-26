
fun MostrarLista(numeros: List<Int>) {
    println("Lista: $numeros")
}

fun CalcularSuma(numeros: List<Int>): Int {
    return numeros.sum()
}

fun CalcularPromedio(numeros: List<Int>): Double {
    return numeros.sum().toDouble() / numeros.size
}

fun main(){
    val numeros = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    MostrarLista(numeros)

    val Suma = CalcularSuma(numeros)
    val Promedio = CalcularPromedio(numeros)
    println("Suma: $Suma")
    println("Promedio: $Promedio")
}