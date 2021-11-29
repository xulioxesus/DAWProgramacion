public class Perro {
    //Atributos o características
    int edad;
    String raza;
    String sexo;
    String color;
    String nombre;
    boolean tieneChip;

    void ladrar(){
        System.out.println("Guau, guau...");
    }

    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        
        Perro.ladrar();
        Perro.nombre = "Laika";
    }
}