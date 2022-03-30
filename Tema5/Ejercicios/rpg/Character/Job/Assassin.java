package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Assassin extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Dexterity){
            resultado = 3;
        }else if (stat instanceof Strength){
            resultado = 1;
        }else if (stat instanceof Constitution){
            resultado = 1;
        }
        
        return resultado;
    }
    
}
