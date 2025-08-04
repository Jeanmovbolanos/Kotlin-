package `24_POO_colaboracion_clases`

import kotlin.random.Random

class  dado (var valor: Int) {

    fun tirar () {
        this.valor = Random.nextInt(1,7).toInt()
        imprimir()
    }

    fun imprimir () {
        println("Valor del dado: $valor")

    }
}

class JuegoDeDados () {
    val dado1 = dado(1)
    val dado2 = dado(1)
    val dado3 = dado(1)

    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()

        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Gano")
        else
            println("perdio ")
    }

}

fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()

}