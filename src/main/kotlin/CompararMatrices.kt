class CompararMatrices {
    fun compararMatrices(A:ArrayList<Array<Int>>,B:ArrayList<Array<Int>>):Boolean{

        for(i in (0 until A.count())){
            for(j in (0 until A[i].size)){
                if(A[i][j] != B[i][j]){
                    println("Diferentes")
                    return false
                }
            }
        }
        println("Iguales")
        return true
    }
}