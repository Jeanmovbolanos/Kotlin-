package `17_funciones_argumentos_nombrados`

fun calcularsueldo(nombre:string, costohora,: double,
                   cantidadhoras:int){
    val sueldo = costohora * cantidadhoras
    println("$nombre trabajo $cantidadhoras horas, se le pega" +
            "por hora $costohora por lo tanto le correponde " +
            "un sueldo de $sueldo")
}
fun main(){
    calcularsueldo("juan", 10.5, 120