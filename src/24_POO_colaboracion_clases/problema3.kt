package `24_POO_colaboracion_clases`

class Motor(var encendido: Boolean = false) {

    fun encender() {
        if (encendido) {
            encendido = true
            println(" El motor ha sido encendido")
        } else {
            println(" El motor ya está encendido")
        }
    }

    fun apagar() {
        if (encendido) {
            encendido = false
            println(" El motor ha sido apagado")
        } else {
            println(" El motor ya está apagado")
        }
    }

    fun estado() {
        val estadoActual = if (encendido) "encendido" else "apagado"
        println(" Estado del motor: $estadoActual")
    }
}

class Carro {
    val motor = Motor()

    fun conducir() {
        if (motor.encendido) {
            println(" El carro está en movimient")
        } else {
            println(" No se puede conducir. El motor está apagado")
        }
    }

    fun estadoGeneral() {
        motor.estado()
    }
}

class SimuladorAuto {
    val miCarro = Carro()

    fun operar() {
        miCarro.conducir()

        miCarro.motor.encender()

        miCarro.conducir()

        miCarro.motor.apagar()
    }

    fun revisarEstado() {
        println("Estado actual del carro:")
        miCarro.estadoGeneral()
    }
}

fun main() {
    val miSimulador = SimuladorAuto()
    miSimulador.operar()
    println("                                                                        ")
    miSimulador.revisarEstado()
}