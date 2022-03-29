class LeyExterna {
    fun leyExterna(A:ArrayList<Array<Int>>,escalar:Int):ArrayList<Array<Int>>{
        println("Matriz Original")
        for(mat in A){
            for (j in mat){
                print(" "+j)
            }
            println()
        }
        for(i in (0 until A.size)){
            for(j in (0 until A[i].size)){
                A[i][j]= escalar*A[i][j]
            }
        }
        println("Matriz Multiplicada por el escalar :"+escalar)
        for(mat in A){
            for (j in mat){
                print(" "+j)
            }
            println()
        }
        return A
    }
}