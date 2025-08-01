package `23_POO_metodos`

class califaciones {
    var nota1: Int = 0
    var nota2: Int = 0
    var nota3: Int = 0
    var nota4: Int = 0

    fun cargarnotas (){
        print("Ingrese la primera nota:")
        nota1= readln().toInt()
        print("Ingrese la segunda nota:")
        nota2= readln().toInt()
        print("Ingrese la tercera nota:")
        nota3= readln().toInt()
        print("Ingrese la cuarta nota:")
        nota4= readln().toInt()
    }

    fun promedionotas() {
        val suma = nota1 + nota2 + nota3 + nota4
        val promedio = suma / 4
        println("El promedio de las notas de los estudiantes es:")

    }

    fun aprobados() {
        var aprobados = 0
        var reprobados= 0

        if (nota1>=70)
            aprobados++
        else
            reprobados++


        if (nota2>=70)
            aprobados++
        else
            reprobados++


        if (nota3>=70)
            aprobados++
        else
            reprobados++

        if (nota4>=70)
            aprobados++
        else
            reprobados++
    }

    }

fun main () {
    val estudiantes = califaciones()
    estudiantes.cargarnotas()
}