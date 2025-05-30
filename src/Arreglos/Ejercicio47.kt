package Arreglos

fun main(){
    val alturas= FloatArray(5)
    var suma = 0f
    for (i in 0..alturas.size-1){
        print("ingrese la altura:")
        alturas[1] = readln().toFloat()
        suma+= alturas[i]
    }
    val promedio = suma / alturas.size
    println("Altura promedio: $promedio")
    var altos= 0
    var bajos = 0
    for (i in 0..alturas.size-1)
        if (alturas[i] > promedio)
            altos++
    else
        bajos++
    println("Cantidad de personas mas altas que el "+
    "promedio: $altos")
    println("Cantidad de personas mas altas que el " +
            "promedio: $altos")
    println("cantidad de perosnas mas bajas que el " +
            "promedio: $bajos")
}