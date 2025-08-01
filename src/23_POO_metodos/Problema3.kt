package `23_POO_metodos`

class Numeros() {
    val lista = IntArray(6)

    fun leerNumeros() {
        for (i in 0..5) {
            print("Ingrese el numero $i:")
            lista[i] = readln().toInt()
        }
        contarPositivos()
        contarNegativos()
    }

    fun contarPositivos() {
        var positivos = 0
        for (i in 0..5) {
            if (lista[i] > 0) {
                positivos++
            }
            println("Numeros positivos: $positivos")
        }

    }

    fun contarNegativos() {
        var Negativos = 0
        for (i in 0..5) {
            if (lista[i] < 0) {
                Negativos++
            }
        }
        println("numeros Negativos: $Negativos")

    }
}