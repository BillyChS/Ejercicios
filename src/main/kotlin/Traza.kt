class Traza {
    fun trazaDeUnaMatriz(A:ArrayList<Array<Int>>):Int{
        println("Matriz Original")
        for(mat in A){
            for (j in mat){
                print(" "+j)
            }
            println()
        }
        var traza = 0
        for(i in (0 until A.count())){
            traza += A[i][i]
        }
        println("Traza = "+ traza)
        return traza
    }
}