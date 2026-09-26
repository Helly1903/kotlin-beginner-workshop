fun isPrime(number: Int): Boolean{
    if (number < 2) return false
    for (i in 2 until number){
        if (number % i == 0) return false
    }
    return true
}

fun factorial(number: Int): Long {
    if (number == 0) return 1
    var resultado = 1L
    for (i in 1..number){
        resultado *= i
    }
    return resultado
}

fun main() {
    val numero = 17
    println("$numero es primo: ${isPrime(numero)}")

    val NumeroFactrial = 3
    println("Factorial de $NumeroFactrial: ${factorial(NumeroFactrial)}")
}