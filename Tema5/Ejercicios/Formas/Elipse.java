public class Elipse extends Forma{

    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, int x, int y, String nombre, double radioMayor, double radioMenor) {
        super(color, x, y, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    
    public double getArea(){
        return Math.PI*radioMayor*radioMenor;
    }
}
