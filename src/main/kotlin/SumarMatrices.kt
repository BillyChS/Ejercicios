class SumarMatrices() {
    fun sumarMatrices(A:ArrayList<Array<Int>>, B:ArrayList<Array<Int>>):ArrayList<Array<Int>>{
        println("Matriz A")
        for(mat in A){
            for (j in mat){
                print(" "+j)
            }
            println()
        }
        println("Matriz B")
        for(mat in B){
            for (j in mat){
                print(" "+j)
            }
            println()
        }
        //Declaro una lista de arrays
        var newMat = ArrayList<Array<Int>>()


        for(i in (0 until A.count())){
            var array = Array<Int>(A[i].size){0}
            for(j in (0 until A[i].size)){
                array[j] = A[i][j]+ B[i][j]
            }
            newMat.add(array)
        }
        println("Suma A + B")
        for(mat in newMat){
            for (j in mat){
                print("  "+j)
            }
            println()
        }
        return newMat
    }
}