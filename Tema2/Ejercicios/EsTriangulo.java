public class EsTriangulo {

    public static boolean esTriangulo(int a, int b, int c){
        
        boolean resultado = false;

        if (a > (b + c) ||
            b > (a + c) ||
            c > (a + b)){
            resultado = false;
        }else{
            resultado = true;
        }

        return resultado;
    }
    public static void main(String[] args) {
        boolean prueba1 = esTriangulo(5,4,2);
        boolean prueba2 = esTriangulo(17,3,1);
    }
}
