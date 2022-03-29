class ProductoDeMatrices {
    fun productoDeMatrice(A:ArrayList<Array<Int>>,B:ArrayList<Array<Int>>):ArrayList<Array<Int>>{

        var newMat = ArrayList<Array<Int>>()
        var colA = 0
        var filA = A.size

        var colB = 0
        var filB = B.size

        for(i in A){
            colA+=i.size
        }
        colA= colA/A.count()
        for(i in B){
            colB+=i.size
        }
        colB= colB/B.count()

        if(colA != filB){
            println("No se pueden multiplicar, las columnas de la matriz A no coinciden con las filas" +
                    "de la matriz B")
        }else{
            var num = 0
            var array = Array<Int>(colB){0}

            for(i in (0 until filA)){
                array = Array<Int>(colB){0}
                for(j in (0 until colB)){
                    for(k in (0 until filB)){
                        num += A[i][k]*B[k][j]
                    }
                    array[j]= num
                    num = 0
                }
                newMat.add(array)
            }
            println("Matriz Resultado")
            for(i in newMat){
                for(j in (0 until i.count())){
                    print("  " + i[j])
                }
                println()
            }

            return newMat
        }

        return newMat

    }
}