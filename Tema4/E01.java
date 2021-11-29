public class E01 {
    public static void main(String[] args) {
        // Eliminar.java
        // int [] elementos = new int[10];

        // Utilidades.rellenaArray(elementos, 1, 20);

        int[] elementos = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
        int indice;

        indice = obtenerIndice(elementos);

        eliminarElemento(elementos, indice);
        
        Utilidades.mostrarArray(elementos);
    }

    public static int obtenerIndice(int[] elementos) {
        int indice;
        do {
            indice = Utilidades.leerEntero("Índice de elemento a eliminar");
        } while ((indice < 0) || (indice > (elementos.length - 1)));
        return indice;
    }

    public static void eliminarElemento(int[] elementos, int indiceBorrar) {
        int elementoBorrar = elementos[indiceBorrar];

        for (int i = indiceBorrar + 1; i < elementos.length; i++) {
            elementos[i - 1] = elementos[i];
        }

        elementos[elementos.length - 1] = elementoBorrar;
    }
}
