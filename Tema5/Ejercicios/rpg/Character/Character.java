package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Strength;
import Character.Stat.Intelligence;

public class Character implements IDamageable{
    private String name;
    private Race race;
    private Job job;
    private double health;

    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;

    public Character(String name, Race race, Job job, int strength, int dexterity, int constitution, int intelligence){
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(strength);
        this.dexterity = new Dexterity(dexterity);
        this.constitution = new Constitution(constitution);
        this.intelligence = new Intelligence(intelligence);
        this.health = maxHealth();
    }

    public String getName(){
        return name;
    }

    public Race getRace(){
        return race;
    }

    public Job getJob(){
        return job;
    }

    public double velocity(){
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2.0f;
    }

    public double power(){
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2.0f;
    }

    public double magic(){
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence)) * 2.0f;
    }

    @Override
    public String toString() {
        return "Character [constitution=" + constitution + ", dexterity=" + dexterity + ", intelligence=" + intelligence
                + ", job=" + job + ", name=" + name + ", race=" + race + ", strength=" + strength + "]";
    }

    @Override
    public double maxHealth() {
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) * 25.0f;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
       return health() <= 0;
    }

    @Override
    public void receivesDamage(double amount) {
        health -= amount;
        if (health < 0){
            health = 0;
        }
        
    }

    @Override
    public void heals(double amount) {
        health += amount;

        if (health > maxHealth()){
            health = maxHealth();
        }
        
    }

    
}
