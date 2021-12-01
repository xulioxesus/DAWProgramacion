public class E03 {
    // Escribid un programa Java para encontrar los elementos comunes entre dos arrays de enteros
    public static void main(String[] args) {
        //int [] primero = {1,2,3,4,5,6,7,8,9,10};
        //int [] segundo = {5,6,7,11,12,13,14};

        int [] primero = new int[1000000];
        Utilidades.rellenaArray(primero, 1, 1000000000);
        int [] segundo = new int[1000000];
        Utilidades.rellenaArray(segundo, 1, 1000000000);


        System.out.println("====================");
        System.out.println("=== Repetidos   ====");
        System.out.println("====================");

        for (int i = 0; i < primero.length; i++) {
            for (int j = 0; j < segundo.length; j++) {
                if (primero[i] == segundo[j]) {
                    System.out.println(primero[i]);
                }
            }
        }

    }
}
