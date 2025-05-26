package `16_Funciones_parametro_por_defecto`

fun titulosubrayado(titulo : string, caracter: string = "*") {
    println(titulo)
    for (i in 1 .. titulo.length)
        println()
}
fun main(){
    titulosubrayado("sistema de administracion")
    titulosubrayado("ventas","-")
}