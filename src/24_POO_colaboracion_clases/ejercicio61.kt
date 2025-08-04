package `24_POO_colaboracion_clases`

class Clientes (var nombre: String, var monto: Float) {

    fun depositar (monto: Float) {
        this.monto += monto

    }

    fun extraer (monto: Float) {
        this.monto -= monto

    }

    fun imprimir() {
        println("$nombre tiene un depositado la suma de $monto")

    }
}

class banco {
    val cliente1: Clientes = Clientes ("juan",0f)
    val cliente2: Clientes = Clientes ("Ana",0f)
    val cliente3: Clientes = Clientes ("Luis",0f)

    fun operar () {
        cliente1.depositar(1000f)
        cliente2.depositar(150f)
        cliente3.extraer(150f)
    }

    fun depositosTotales() {
        val total = cliente1.monto + cliente2.monto + cliente3.monto
        println("el total de dinero del banco es: $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}

fun main() {
    val banco1 = banco()
    banco1. operar()
    banco1. depositosTotales()
}