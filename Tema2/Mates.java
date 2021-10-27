public class Mates {

    public static double suma(double x, double y){
        return x + y;
    }

    public static double resta(double x, double y){
        return x - y;
    }

    public static double multiplicacion(double x, double y){
        return x * y;
    }

    public static double division(double x, double y){
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println("suma: 25 es igual a " + suma(12,13));
        System.out.println("resta: -1 es igual a " + resta(12,13));
        System.out.println("multiplicacion: 156 es igual a " + multiplicacion(12,13));
        System.out.println("division: 0.923 es igual a " + division(12,13));
    }
}