import java.util.HashSet;
import java.util.Set;

public class Jornada {
    Set<Pareja> parejas;

    public Jornada(){
        parejas = new HashSet<Pareja>();
    }

    public boolean isInConflict(Pareja other){
        for (Pareja pareja : parejas) {
            if (other.isInConflict(pareja)){
                return true;
            }
        }

        return false;
    }

    public int size(){
        return parejas.size();
    }

    @Override
    public String toString() {

        String resultado = "";

        for (Pareja pareja : parejas) {
            resultado += pareja + "\n";
        }
        return resultado;
    }
}
