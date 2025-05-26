package `18_funciones_internas`

fun mostrarMayoresDePares() {
    // Función interna que retorna el mayor de dos enteros
    fun mayor(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    for (i in 1..5) {
        println("Par #$i:")
        print("Ingrese primer número: ")
        val num1 = readln().toInt()
        print("Ingrese segundo número: ")
        val num2 = readln().toInt()

        val max = mayor(num1, num2)
        println("El mayor es: $max\n")
    }
}

fun main() {
    mostrarMayoresDePares()
}