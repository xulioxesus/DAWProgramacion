import java.util.Random;
import java.util.Scanner;

class ChorriChat{

    final static int SIN_SALUDO = 0;
    final static int SALUDO = 1;
    final static int BUCLE = 2;
    final static int FIN = 3;
    public static void main(String[] args) {
        
        Scanner lectorTeclado = new Scanner(System.in);

        int estado = SIN_SALUDO;

        while (estado != FIN){
            System.out.print("ChorriChat> ");
            String linea = lectorTeclado.nextLine().toLowerCase();
            estado = updateEstado(estado, linea);
            imprimirFrase(estado);
        }

        lectorTeclado.close();
    }

    private static void imprimirFrase(int estado) {
        switch (estado) {
            case SIN_SALUDO:
                System.out.println("Eres una persona maleducada");
                break;
            case SALUDO:
                System.out.println("Hola, soy Chorri, tus asistente.");
                break;
            case BUCLE:
                imprimirBucleAleatorio();
                break;

            case FIN:
                System.out.println("Ha sido un placer, bebé");
                break;
        
            default:
                break;
            }
    }

    private static void imprimirBucleAleatorio() {
        Random r = new Random();
		int indice = r.nextInt(3);

        String [] frases = {"Mmm, es un tema interesante",
                            "No he entendido lo que dices",
                            "Nooo hablooo tu idioma"};
        System.out.println(frases[indice]);
    }

    private static int updateEstado(int estado, String linea) {

        int resultado = estado;
        switch (resultado) {
            case SIN_SALUDO:
                if (isSaludo(linea)){
                    resultado = SALUDO;
                }
                break;
            case SALUDO:
                resultado = BUCLE;
                break;
            case BUCLE:
                if (isFin(linea)){
                    resultado = FIN;
                }
                break;

            case FIN:
                break;
        
            default:
                break;
            }
        return resultado;
    }

    private static boolean isSaludo(String linea) {
        return (linea.contains("hola") ||
                linea.contains("buenos dias") ||
                linea.contains("buenas"));
    }

    private static boolean isFin(String linea) {
        return ((linea.indexOf("chao") >= 0) ||
            (linea.indexOf("ta luego") >= 0) ||
            (linea.indexOf("bye") >= 0) ||
            (linea.indexOf("adios") >= 0));
    }
}