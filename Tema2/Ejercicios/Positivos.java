public class Positivos {

    public static int positivos(int [] numeros) {
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                resultado++;
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        int [] numeritos = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(positivos(numeritos));

        int [] numeritos2 = {2};
        System.out.println(positivos(numeritos2));

        int [] numeritos3 = {};
        System.out.println(positivos(numeritos3));

                
    }
}
