import java.util.Scanner;

public class P112Radares {

    static Scanner lector = new Scanner(System.in);
    static double distancia;
    static double maxima;
    static double tiempo;

    static void procesarCasoActual() {

        double media = (distancia / 1000) / (tiempo / 3600);

        if (distancia > 0 && maxima > 0 && tiempo > 0) {
            if (media <= maxima) {
                System.out.println("OK");
            } else if ((media > maxima )&& (media < (maxima * 1.2))) {
                System.out.println("MULTA");
            } else {
                System.out.println("PUNTOS");
            }
        }else{
            System.out.println("ERROR");    
        }
    }

    static void leerSiguienteCasoDePrueba() {
        String linea = lector.nextLine();
        String[] strs = linea.split(" ");
        distancia = Double.parseDouble(strs[0]);
        maxima = Double.parseDouble(strs[1]);
        tiempo = Double.parseDouble(strs[2]);
    }

    public static void main(String[] args) {
        
        leerSiguienteCasoDePrueba();

        while (!(distancia == 0 && maxima == 0 && tiempo == 0)) {
            procesarCasoActual();
            leerSiguienteCasoDePrueba();
        }
    }

}