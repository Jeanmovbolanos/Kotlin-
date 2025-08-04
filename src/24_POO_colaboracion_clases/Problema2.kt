package `24_POO_colaboracion_clases`

class Estudiante(var nombre: String, var asistencias: Int = 0) {

    fun registrarAsistencia() {
        asistencias += 1
        println("Asistencia registrada para $nombre.")
    }

    fun imprimir() {
        println("$nombre ha asistido $asistencias veces.")
    }
}

class Clase {
    val est1 = Estudiante("Juan")
    val est2 = Estudiante("Ana")
    val est3 = Estudiante("Luis")

    fun marcarAsistencia() {
        est1.registrarAsistencia()
        est2.registrarAsistencia()
        est3.registrarAsistencia()
    }

    fun reporte() {
        println("Reporte de asistencias:")
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()
    }
}

fun main() {
    val miClase = Clase()
    miClase.marcarAsistencia()
    miClase.reporte()
}