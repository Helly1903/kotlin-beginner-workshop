fun Saludar(NombreUsuario: String?): String {
    val NombreSeguro = NombreUsuario ?: ""
    return if (NombreSeguro.isNotEmpty()) {
        "Hola, $NombreSeguro"
    }
    else {
        "Hola, Usuario Fantasma"
    }
}

fun main () {
    val Nombre1: String? = "Santiago"
    val Nombre2: String? = null
    val Nombre3: String? = ""

    println(Saludar(Nombre1))
    println(Saludar(Nombre2))
    println(Saludar(Nombre3))
}