fun MostrarTabla(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun SumarResultadosTabla(numero: Int): Int {
    var suma = 0
    for (i in 1..10) {
        suma += numero * i
    }
    return suma
}

fun main() {
    val numero = 7
    MostrarTabla(numero)

    val suma = SumarResultadosTabla(numero)
    println("Suma Total: $suma")
}