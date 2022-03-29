class TransponerMatriz {

    fun transponerMatriz(newMat:ArrayList<Array<Int>>):ArrayList<Array<Int>>{

        var tMat = ArrayList<Array<Int>>()
        var fil = newMat.size
        var col = newMat[0].size
        var array = Array<Int>(fil){0}

        for(i in (0 until col)){
            array = Array<Int>(fil){0}
            tMat.add(array)
        }
        println("Matriz Original")
        for(mat in newMat){
            for (j in mat){
                print(" "+j)
            }
            println()
        }

        for(i in (0 until fil)){
            for(j in (0 until col)){
                tMat[j][i]=newMat[i][j]
            }
        }


        println("Matriz Transpuesta")
        for(i in tMat){
            for(j in (0 until i.count())){
                print(" "+i[j])
            }
            println()
        }
        return tMat
    }
}