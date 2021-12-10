public class E09ValoresACero {
    public static void main(String[] args) {
        int [][] matriz = { {0,0,0,0,0,0,0,0,0,0},
                            {0,1,0,0,0,0,0,0,0,0},
                            {0,0,1,0,0,0,0,0,0,0},
                            {0,0,0,1,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0},
                            {0,0,0,0,0,0,1,0,0,0},
                            {0,0,0,0,0,0,0,1,0,0},
                            {0,0,0,0,0,0,0,0,1,0},
                            {0,0,0,0,0,0,0,0,0,0}
                        };

        int numFilasCero = 0;
        int numColumnasCero = 0;
        int i,j;
        boolean esFilaCero;
        boolean esColumnaCero;

        for (i = 0; i < matriz.length; i++) {
            esFilaCero = true;
            for (j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == 1){
                    esFilaCero = false;
                    break;
                }
            }

            if(esFilaCero)
                numFilasCero++;
        }

        System.out.println("Filas a cero: " + numFilasCero);

        for (i = 0; i < matriz.length; i++) {
            esColumnaCero = true;
            for (j = 0; j < matriz[i].length; j++) {
                if(matriz[j][i] == 1){
                    esColumnaCero = false;
                    break;
                }
            }

            if(esColumnaCero)
                numColumnasCero++;
        }
        System.out.println("Columnas a cero: " + numColumnasCero);
    }
}
