public class Pareja {
    String jugador1;
    String jugador2;

    public Pareja(String a, String b){
        jugador1 = a;
        jugador2 = b;
    }

    public boolean isInConflict(Pareja other){
        return other.jugador1.equals(jugador1) || other.jugador2.equals(jugador2) ||
        other.jugador2.equals(jugador1) || other.jugador1.equals(jugador2) ;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == this){
            return true;
        }

        if(!(obj instanceof Pareja)){
            return false;
        }

        Pareja pareja = (Pareja) obj;
        
        return  (pareja.jugador1.equals(jugador1) && pareja.jugador2.equals(jugador2)) ||
                (pareja.jugador2.equals(jugador1) && pareja.jugador1.equals(jugador2));
    }
    @Override
    public String toString() {
        return jugador1 + jugador2;
    }
}
