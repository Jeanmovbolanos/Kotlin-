package `2_Entrada_de_datos`

fun main() {
    print("ingrese la medida del lado del cuadrado:")
    val lado: Int = readln(). toInt()
    val perimetro: Int = lado * 4
    println(" El perimetro del cuadrado es $perimetro")

}