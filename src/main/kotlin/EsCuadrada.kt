class EsCuadrada {
    fun esUnaMatrizCuadrada(A:ArrayList<Array<Int>>):Boolean{
        var filas = A.size
        var columnas = 0
        for(i in A){
            columnas+=i.size
        }
        if(columnas/filas != filas){
            println("No es cuadrada")
            return false
        }else{
            println("Es cuadrada")
            return true
        }
    }
}