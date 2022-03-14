import java.util.ArrayDeque;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<Forma>();

        Forma f1 = new Forma("rojo", 2, 3, "forma1");
        f1.mover(7, 8);
        f1.setColor("amarillo");

        Rectangulo r1 = new Rectangulo("azul", 6, 0, "rec1", 4.0, 3.0);
        r1.mover(7, 8);
        r1.setColor("amarillo");
        r1.escalar(2.0);

        Circulo c1 = new Circulo("magenta", 1, 0, "circulito", 2.0);

        Elipse e1 = new Elipse("negro", 1, 1, "elipsita", 3.0, 4.0);
        
        lista.add(f1);
        lista.add(r1);
        lista.add(c1);
        lista.add(e1);

        for (Forma item: lista) {
            item.mover(0, 0);
            item.imprimir();
        }
    }
}
