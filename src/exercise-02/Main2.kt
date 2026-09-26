fun calcularPromedio(nota1: Double, nota2: Double, nota3: Double): Double{
    return (nota1 + nota2 + nota3) / 3.0
}
fun main () {
    val nombreEstudiante = "Santiago"
    val nota1 = 4.2
    val nota2 = 3.5
    val nota3 = 4.5

    val promedio = calcularPromedio(nota1, nota2, nota3)
    println("Estudiante: $nombreEstudiante")
    println("Promedio: $promedio")
}