
class Contact (val nombre: String, val telefono: String, val correo: String)

fun ListarContactos(Contactos: List<Contact>) {
    for (contacto in Contactos) {
        println("${contacto.nombre} --  ${contacto.telefono} -- ${contacto.correo}")
    }
}

fun AgregarContacto(contactos: MutableList<Contact>, nuevo: Contact) {
    contactos.add(nuevo)
    println("Contacto agregado: ${nuevo.nombre}")
}

fun BuscarPorNombre(contactos: MutableList<Contact>, nombre: String): Contact? {
    return contactos.find { it.nombre.equals(nombre, ignoreCase = true) }
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

    AgregarContacto(Contactos, Contact("KekoJones", "1122334455", "KekoJones@gmail.com"))

    val Encontrado = BuscarPorNombre(Contactos, "Kekojones")
    if (Encontrado != null) {
        println("Encontrado: ${Encontrado.nombre}, ${Encontrado.telefono}, ${Encontrado.correo}")
    }
    else {
        println("Contacto no encontrado")
    }

}