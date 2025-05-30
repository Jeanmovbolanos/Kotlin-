package Arreglos

fun main() {
    val sueldos: IntArray// arreglo o lista de tipo Int(entero)
    // se deifne 5 espacios del 0 al 4
    sueldos = IntArray(5)

    //carga de sus elemetos por teclado
    for (i in 0..4){
        print("Ingrese sueldo")
        sueldos[i] = readln().toInt()
    }
    //impresion de sus elementos
    for(i in 0..4){
        println(sueldos[i])
    }
}