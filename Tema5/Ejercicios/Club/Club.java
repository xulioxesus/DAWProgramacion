import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...

    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }

    /**
     * Determinar el número de miembros que se han unido en el mes indicado
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido ese mes
     */
     
    public int joinedInMonth(int month){
        int resultado = 0;

        if(month < 1 || month > 12){
            System.out.println("joinedInMonth - Mes incorrecto: " + month);
        }else{

            for (Membership item : members) {
                if(item.getMonth() == month){
                    resultado++;
                }
            }
        }

        return resultado;
    }

    public int purgue(int month){
        int eliminados = 0;

        Iterator<Membership> it = members.iterator();

        while (it.hasNext()) {
            Membership item = it.next();

            if (item.getMonth() == month){
                it.remove();
                eliminados++;
            }
        }

        return eliminados;
    }
}
