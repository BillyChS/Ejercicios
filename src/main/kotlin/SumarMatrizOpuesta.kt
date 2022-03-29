class SumarMatrizOpuesta {
    fun sumarMatrizOpuesta(A:ArrayList<Array<Int>>){

        println("Matriz Original")
        for(mat in A){
            for (j in mat){
                print(" "+j)
            }
            println()
        }

        var opuesta = ArrayList<Array<Int>>()

        for(i in (0 until A.size)){
            var array = Array<Int>(A[i].size){0}
            for(j in (0 until A[i].size)){
                array[j]=A[i][j]*-1
            }
            opuesta.add(array)
        }

        println("Matriz Opuesta")
        for(mat in opuesta){
            for (j in mat){
                print(" "+j)
            }
            println()
        }
        var suma = ArrayList<Array<Int>>()
        for (i in (0  until A.size)){
            var array = Array<Int>(A[i].size){0}
            for (j in (0 until A[i].size)){
                array[j] = A[i][j]+opuesta[i][j]
            }
            suma.add(array)
        }
        println("Suma Matriz A + -A")
        for(mat in suma){
            for (j in mat){
                print(" "+j)
            }
            println()
        }

    }
}