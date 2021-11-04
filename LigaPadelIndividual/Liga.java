import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;

/**
 * Liga
 */
public class Liga {

    static Random random = new Random();
    public static void main(String[] args) {
        
        Set<Pareja> parejas = new HashSet<Pareja>();
        String[] jugadores = {"Alberto", "Bartolo", "Carlos", "Daniel", "Emilio", "Fernando", "Gerardo","Hipolito" };

        System.out.println("================================");
        System.out.println("Parejas");
        System.out.println("================================");

        for (int i = 0; i < jugadores.length-1; i++) {
            for (int j = i+1; j <= jugadores.length-1; j++) {
                System.out.println(jugadores[i] + " - " + jugadores[j]);
                parejas.add(new Pareja(jugadores[i], jugadores[j]));
            }
        }

        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("================================");
            System.out.println("Jornada " + (i + 1));
            System.out.println("================================");

            Jornada jornada = new Jornada();

            int j = 0;

            while (jornada.size() < jugadores.length/2){
                Pareja temp = getElement(parejas,j);

                if (!jornada.isInConflict(temp)){
                    jornada.parejas.add(temp);
                    parejas.remove(temp);
                }
                j++;
            }
            System.out.println(jornada);
        }

        System.out.println("Fin programa");
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