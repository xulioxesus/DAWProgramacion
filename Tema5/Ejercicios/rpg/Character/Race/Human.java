package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {

        int resultado = 0;
        
        if (stat instanceof Strength){
            resultado = 2;
        }else if (stat instanceof Constitution){
            resultado = 2;
        }else if (stat instanceof Dexterity){
            resultado = 1;
        }
        
        return resultado;
    }
    
}
