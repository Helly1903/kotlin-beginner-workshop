fun Saludar(NombreUsuario: String?): String {
    if (!NombreUsuario.isNullOrEmpty()) {
        return "Hola, ${NombreUsuario}"
    }
    return "Hola, usuario fantasma"
}

fun main () {
    val Nombre1: String? = "Santiago"
    println(Saludar(Nombre1))
}