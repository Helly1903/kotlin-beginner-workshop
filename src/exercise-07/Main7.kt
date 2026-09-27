
class Contact (val nombre: String, val telefono: String, val correo: String)

fun ListarContactos(Contactos: List<Contact>) {
    for (contacto in Contactos) {
        println("${contacto.nombre} --  ${contacto.telefono} -- ${contacto.correo}")
    }
}


fun main () {
    val Contactos = mutableListOf(
        Contact("Ana", "1234567890", "ana@gmail.com"),
        Contact("Luis", "0987654321", "Luis@gmail.com"),
        Contact("Carla", "1234567890", "Carla@gmail.com"),
        Contact("Pedro", "098765321", "Pedro@gmail.com"),
        Contact("Pablo", "1234567890", "Pablo@gmail.com"),
    )
        ListarContactos(Contactos)
}