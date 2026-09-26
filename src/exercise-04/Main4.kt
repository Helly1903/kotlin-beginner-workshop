fun MostrarLista(numeros: List<Int>) {
    println("Lista: $numeros")
}

fun CalcularSuma(numeros: List<Int>): Int {
    return numeros.sum()
}

fun CalcularPromedio(numeros: List<Int>): Double {
    return numeros.sum().toDouble() / numeros.size
}

fun DeterminarMayor(numeros: List<Int>): Int {
    return numeros.max()
}

fun DeterminarMenor(numeros: List<Int>): Int {
    return numeros.min()
}

fun ContarPares(numeros: List<Int>): Int {
    var contador = 0
    for (numero in numeros) {
        if (numero %2 == 0){
            contador++
        }
    }
    return contador
}

fun ContarImpares(numeros: List<Int>): Int {
    return numeros.size - ContarPares(numeros)
}

fun main(){
    val numeros = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    MostrarLista(numeros)

    val Suma = CalcularSuma(numeros)
    val Promedio = CalcularPromedio(numeros)

    println("Suma: $Suma")
    println("Promedio: $Promedio")
    println("Mayor: ${DeterminarMayor(numeros)}")
    println("Menor: ${DeterminarMenor(numeros)}")
    println("Pares: ${ContarPares(numeros)}")
    println("Impares: ${ContarImpares(numeros)}")
}