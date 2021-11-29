import java.util.Scanner;
public class E09 {
    public static void main(String[] args) {
        System.out.print("Ingrese nota certamen 1: ");
        Scanner lector = new Scanner(System.in);
        double c1 = lector.nextDouble();

        System.out.print("Ingrese nota certamen 2: ");
        double c2 = lector.nextDouble();

        System.out.print("Ingrese nota laboratorio: ");
        double nl = lector.nextDouble();
        lector.close();
        

     double nc = (60-(nl*0.3))/0.7;
     double c3 = (nc * 3) - (c1+c2);
     System.out.println("Necesita nota " + c3 + " en el certamen 3");
    }
}