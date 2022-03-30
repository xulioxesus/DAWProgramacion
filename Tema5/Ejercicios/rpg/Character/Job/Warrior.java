package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Warrior extends Job{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Strength){
            resultado = 3;
        }else if (stat instanceof Constitution){
            resultado = 2;
        }
        
        return resultado;
    }
    
}
