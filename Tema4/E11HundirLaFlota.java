public class E11HundirLaFlota {
    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int cont = 0;
    
        while (cont < numShips) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2]=1;
                cont++;
            }
        }
    }

    public static void imprimirTablero(int[][] tablero) {
        char letra = 'A';
        System.out.println("  1 2 3 4 5 6 7 8");

        for (int i = 0; i < tablero.length; i++) {
            System.out.print(letra + " ");
            letra++;
            for (int j = 0; j < tablero.length; j++) {
                switch (tablero[i][j]) {
                    case 0:
                    case 1:
                        System.out.print(". ");
                        break;
                    case 2:
                        System.out.print("O ");
                        break;
                    case 3:
                        System.out.print("X ");
                        break;
                    default:
                        break;
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] tablero = { {0, 0, 1, 1, 0, 1, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 1},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {1, 0, 0, 0, 0, 1, 0, 0},
                            {0, 0, 0, 1, 0, 0, 0, 0},
                            {0, 0, 0, 1, 0, 0, 0, 0},
                            {1, 0, 0, 0, 0, 0, 1, 0}};

                    
        imprimirTablero(tablero);
        while(true){
            char row = Utilidades.leerCaracter("Enter row(Letter): ");
            int columnNumber = Utilidades.leerEntero("Enter column(Number): ");
            int rowNumber = row - 'A';
            columnNumber--;

            if (tablero[rowNumber][columnNumber] == 0 || tablero[rowNumber][columnNumber] == 1){
                tablero[rowNumber][columnNumber] += 2;
            }
            imprimirTablero(tablero);
        }
    }    
}
