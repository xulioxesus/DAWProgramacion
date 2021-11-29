import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;

/**
 * Liga
 */
public class Liga {
    final static byte NUMJUGADORES = 16;

    static Random random = new Random();
    static ArrayList<Jornada> campeonato = new ArrayList<Jornada>();
    static Set<Pareja> parejas = new HashSet<Pareja>();
    static String[] jugadores = {"Alberto", "Bartolo", "Carlos", "Daniel", "Emilio", "Fernando", "Gerardo","Hipolito" };
    public static void main(String[] args) {

        jugadores = rellenarJugadores(NUMJUGADORES);
        parejas = rellenarParejas(jugadores);

        for (int i = 0; i < jugadores.length-1; i++) {
            System.out.println("================================");
            System.out.println("Jornada " + (i + 1));
            System.out.println("================================");

            Jornada jornada = new Jornada();

            while (jornada.size() < jugadores.length/2){
                Pareja temp = getRandomElement(parejas);

                if (!jornada.isInConflict(temp)){
                    jornada.parejas.add(temp);
                    parejas.remove(temp);
                }
            }
            System.out.println(jornada);
        }

        System.out.println("================================");
        System.out.println("Parejas no asignadas");
        System.out.println("================================");
        System.out.println(parejas);
        System.out.println("Fin programa");
    }

    private static Set<Pareja> rellenarParejas(String[] jugadores) {
        System.out.println("================================");
        System.out.println("Parejas");
        System.out.println("================================");

        Set<Pareja> resultado = new HashSet<Pareja>();

        for (int i = 0; i < jugadores.length-1; i++) {
            for (int j = i+1; j <= jugadores.length-1; j++) {
                System.out.println(jugadores[i] + " - " + jugadores[j]);
                resultado.add(new Pareja(jugadores[i], jugadores[j]));
            }
        }

        return resultado;
    }

    private static String[] rellenarJugadores(int numJugadores){
        char inicial = 'a';
        String [] resultado = new String[numJugadores];

        for (int i = 0; i < numJugadores; i++) {
            resultado[i] = Character.toString(inicial).repeat(3);
            inicial++;
        }

        return resultado;
    }

    private static <E> E getRandomElement(Set<? extends E> set){

        //this will generate a random number between 0 and HashSet.size - 1
        int randomNumber = random.nextInt(set.size());

        //get an iterator
        Iterator<? extends E> iterator = set.iterator();

        int currentIndex = 0;
        E randomElement = null;

        //iterate the HashSet
        while(iterator.hasNext()){
            randomElement = iterator.next();

            //if current index is equal to random number
            if(currentIndex == randomNumber)
                return randomElement;
            //increase the current index
            currentIndex++;
        }

        return randomElement;
    }

    private static <E> E getElement(Set<? extends E> set, int pos){

        //get an iterator
        Iterator<? extends E> iterator = set.iterator();

        int currentIndex = 0;
        E randomElement = null;

        //iterate the HashSet
        while(iterator.hasNext()){
            randomElement = iterator.next();
            //if current index is equal to random number
            if(currentIndex == pos)
                return randomElement;
            //increase the current index
            currentIndex++;
        }

        return randomElement;
    }
}