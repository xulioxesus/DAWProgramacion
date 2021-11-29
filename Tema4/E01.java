public class E01 {
    public static void main(String[] args) {
        //Eliminar.java
        //int [] elementos = new int[10];

        //Utilidades.rellenaArray(elementos, 1, 20);  

        int [] elementos = {101,102,103,104,105,106,107,108,109,110};

        int indiceBorrar = 2;
        int elementoBorrar = elementos[indiceBorrar];

        for (int i = indiceBorrar + 1; i < elementos.length; i++) {
            elementos[i-1] = elementos[i];
        }

        elementos[elementos.length - 1] = elementoBorrar;
    }
}
