/**
 * E07
 */
public class E07MoverCeros {

    public static void main(String[] args) {
        int [] vector = {1, 2, 3, 0, 0, 4, 0, 5, 6};

        for (int i = vector.length - 1; i >= 0; i--) {
            if (vector[i] == 0) {
                moverCeroDerecha(vector, i);
            }
        }
    }

    public static void moverCeroDerecha(int[] vector, int pos) {

        for (int i = pos; i < vector.length - 1; i++) {
            vector[i] = vector[i+1];
            vector[i+1] = 0;
        }
    }
}