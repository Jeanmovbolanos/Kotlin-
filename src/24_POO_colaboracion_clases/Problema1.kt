package `24_POO_colaboracion_clases`

class Libro (var titulo: String, var estado: Boolean) {
    fun prestar() {
        if  (estado) {
            estado = true
            println("El libro $titulo se a prestado")
        } else {
            println("El libro $titulo ya a sido prestado y no se puede prestar")
        }
    }
    fun devolver() {
        if (estado) {
            estado = false
            println("El libro $titulo ha sido devuelto")
        } else {
            println("El libro $titulo estaba disponible, no necesita devolverlo")
        }
    }

    fun estado() {
        val estadoActual =
            if (estado) "prestado"
            else "disponible"
        println("Libro: $titulo se encuentra: $estadoActual")
    }
}
class Biblioteca {
    val libro1 = Libro("los 3 cerditos", false)
    val libro2 = Libro("ana frank",true)
    val libro3 = Libro("el principito",false)

    fun operar() {
        libro1.prestar()
        libro2.prestar()
        libro3.devolver()
    }

    fun revisarEstado() {
        println("Estado actual de los libros:")
        libro1.estado()
        libro2.estado()
        libro3.estado()
    }
}

fun main() {
    val misLibros = Biblioteca()
    misLibros.operar()
    println("                                                                        ")
    misLibros.revisarEstado()
}