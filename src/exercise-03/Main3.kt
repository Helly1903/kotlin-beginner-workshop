fun MostrarTabla(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun main() {
    val numero = 7
    MostrarTabla(numero)
}