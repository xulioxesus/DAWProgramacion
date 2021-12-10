public class E08RellenarMatriz {

    public static void 	mostrarMatriz(int matriz[][]) {
		int i,j; 
		int filas = matriz.length;
		int columnas = matriz[0].length;
		// Recorrido de las filas de la matriz
		for (i=0; i < filas; i++) {
			  // Recorrido de las celdas de una fila
			  for (j=0; j<columnas; j++) {
				  System.out.print(matriz[i][j] + " " );
			}

            System.out.println();
		}
	}
    public static void main(String[] args) {
        int [][] miMatriz = new int [10][10];

        Utilidades.rellenaMatriz(miMatriz,0,1);

        mostrarMatriz(miMatriz);
    }
}
