package Arreglos

fun main() {
    // Definir el arreglo de enteros
    val arreglo = IntArray(8)

    // Cargar el arreglo
    for (i in arreglo.indices) {
        print("Ingrese el elemento ${i + 1}: ")
        arreglo[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Variables para acumular valores
    var acumuladoTotal = 0
    var acumuladoMayores36 = 0
    var cantidadMayores50 = 0

    // Analizar cada elemento del arreglo
    for (elemento in arreglo) {
        acumuladoTotal += elemento
        if (elemento > 36) {
            acumuladoMayores36 += elemento
        }
        if (elemento > 50) {
            cantidadMayores50++
        }
    }

    // Imprimir resultados
    println("Valor acumulado de todos los elementos: $acumuladoTotal")
    println("Valor acumulado de los elementos mayores a 36: $acumuladoMayores36")
    println("Cantidad de valores mayores a 50: $cantidadMayores50")
}