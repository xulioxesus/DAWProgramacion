public class EsDivisible {

    public static boolean esDivisible(int n, int m){

        boolean resultado = false;

        if (n%m == 0){
            resultado = true;
        }
        else{
            resultado = false;
        }

        return resultado;
    }
    public static void main(String[] args) {
        boolean prueba1 = esDivisible(4,2);
        boolean prueba2 = esDivisible(4,3);
        boolean prueba3 = esDivisible(3,4);
        boolean prueba4 = esDivisible(2,8);
    }
}
