fun calcularOperacion(num1: Double, num2: Double, operacion: Char): String {
    return when (operacion) {
        '+' -> "Resultado: ${num1 + num2}"
        '-' -> "Resultado: ${num1 - num2}"
        '*' -> "Resultado: ${num1 * num2}"
        else -> "Operacion no valida"

    }
}

fun main (){
    val numero1 = 10.0
    val numero2 = 2.0
    val operacion = '+'
    println(calcularOperacion(numero1, numero2, operacion))
}