package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;

public class Mage extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Intelligence){
            resultado = 4;
        }else if (stat instanceof Dexterity){
            resultado = 1;
        }
        
        return resultado;
    }
    
}
