package Arreglos

fun main() {
    // Definir los arreglos de enteros
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val arregloSuma = IntArray(4)

    // Cargar el primer arreglo
    println("Ingrese los elementos del primer arreglo:")
    for (i in arreglo1.indices) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Cargar el segundo arreglo
    println("Ingrese los elementos del segundo arreglo:")
    for (i in arreglo2.indices) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Calcular la suma elemento a elemento
    for (i in arreglo1.indices) {
        arregloSuma[i] = arreglo1[i] + arreglo2[i]
    }

    // Imprimir resultados
    println("Arreglo 1: ${arreglo1.joinToString()}")
    println("Arreglo 2: ${arreglo2.joinToString()}")
    println("Arreglo suma: ${arregloSuma.joinToString()}")
}