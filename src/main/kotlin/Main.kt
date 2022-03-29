

fun main(args: Array<String>) {
    var vec2 = arrayOf<Int>(1, 2, 3) //Decalarcion de un array de Int


    var A = ArrayList<Array<Int>>()
    A.add(arrayOf<Int>(2, -3, -5))
    A.add(arrayOf<Int>(-1, 4, 5))
    A.add(arrayOf<Int>(1, -3, -4))
    var B = ArrayList<Array<Int>>()
    B.add(arrayOf<Int>(-1, 3, 5))
    B.add(arrayOf<Int>(1, -3, -5))
    B.add(arrayOf<Int>(-1, 3, 5))

    var test = ProductoDeMatrices().productoDeMatrice(A,B)

    //var sumaMatrices = SummaryMatrices().sumarMatrices(A,B)
    //var trasnsponerMatriz = TransponerMatriz().transponerMatriz(A)
    //var escuadrada = EsCuadrada().esUnaMatrizCuadrada(A)
    //var leyexterna = LeyExterna().leyExterna(A,5)
    //var sumarmatrizopuesta = SumarMatrizOpuesta().sumarMatrizOpuesta(A)
    //var productodeMatrices = ProductoDeMatrices().productoDeMatrice(A,B)


    var filas = 0
    var columnas = 0
/*
    println("-----Matrices---")
    //Matriz 1
    println("Digite el tamaño de las filas para la matriz A")
    filas = readLine()!!.toInt()
    println("Digite el tamaño de las columnas para la matriz B")
    columnas = readLine()!!.toInt()


    var array = Array<Int>(columnas){0}
    var num = 0


    for(i in (0 until filas)){
        array = Array<Int>(columnas){0}
        for(j in (0 until columnas)){
            println("Digite un numero")
            num = readLine()!!.toInt()
            array[j] = num
        }
        C.add(array)
    }

    println("Matriz C :")
    for(i in C){
        for(j in (0 until i.count())){
            print(" "+i[j])
        }
        println()
    }

    println("Digite el tamaño de las filas para la matriz A")
    filas = readLine()!!.toInt()
    println("Digite el tamaño de las columnas para la matriz B")
    columnas = readLine()!!.toInt()


    array = Array<Int>(columnas){0}
    num = 0


    for(i in (0 until filas)){
        array = Array<Int>(columnas){0}
        for(j in (0 until columnas)){
            println("Digite un numero")
            num = readLine()!!.toInt()
            array[j] = num
        }
        D.add(array)
    }

    println("Matriz D :")
    for(i in D){
        for(j in (0 until i.count())){
            print(" "+i[j])
        }
        println()
    }


 */

    //var t = transponerMatriz(transponerMatriz(C))
    //trazaDeUnaMatriz(transponerMatriz(C))
    //println("Presione una opcion")
    //println("1-Sumar 2 matrices")
    //println("2-Sumar 2 matrices")
    //println("3-Sumar 2 matrices")
    //println("4-Sumar 2 matrices")
    //sumarMatrices()
    //trasponerMatriz(A)
    //compararMatrices(A,B)
    //trazaDeUnaMatriz(A)
    //trazaDeUnaMatriz(B)
    //esUnaMatrizCuadrada(A)
    //esUnaMatrizCuadrada(B)
    //var matA =leyExterna(A,-3)
    //var matB =leyExterna(B,2)
    //sumarMatrizOpuesta(A)
    //transponerMatriz(productoDeMatrice(D,C))
    //productoDeMatrice(C,D)
    //var opc = readLine()!!.toInt()

    /*when(opc){
        1 ->{
            sumarMatrices()
        }
        2->{

        }
    }
*/
}