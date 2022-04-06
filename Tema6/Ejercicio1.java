import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio1 {

    private static void imprimirFichero(File e, int id) {

        // No imprime los ficheros/directorios ocultos

        if (!e.isHidden()) {
            if (e.isFile()) {
                System.out.println(id + ".- " + e.getName() + " " + e.length());
            }
            if (e.isDirectory()) {
                System.out.println(id + ".- " + e.getName() + " <Directorio>");
            }
        }
    }

    private static void imprimirDirectorio(File f) throws IOException {

        int contador = 1;

        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
                System.out.println("---------------------------------------------------");

                if (f.getParent() != null){
                    System.out.println("0.- Directorio padre");
                }

                for (File e : f.listFiles()) {
                    imprimirFichero(e,contador);
                    contador++;
                }
            } else {
                System.out.println("No es un directorio");
            }

        } else {
            System.out.println("No existe el directorio");
        }
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        String entradaUsuario = "";
        int resultado = 0;

        System.out.print("Introduce una opcion (-1 para salir):");

        entradaUsuario = teclado.nextLine();

        resultado = Integer.parseInt(entradaUsuario); //Posible error en parse

        return resultado;
    }

    public static void main(String[] args) throws IOException {

        File actualFile = File.listRoots()[0]; //Empezamos con el fichero raíz
        int opcion = 0;
        
        do {
            imprimirDirectorio(actualFile);
            opcion = leerOpcion();

            if (opcion >= 1 && opcion <= actualFile.listFiles().length){
                
                File nextFile = actualFile.listFiles()[opcion-1];

                if(nextFile.isDirectory() && nextFile.canRead()){
                    actualFile = nextFile;
                }
            }
            else if (actualFile.getParent() != null && opcion == 0){
                actualFile = actualFile.getParentFile();
            }
        } while (opcion != -1);

    }
}