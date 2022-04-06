import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    private static void imprimirFichero(File e, int id) {

        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

        // No imprime los ficheros/directorios ocultos

        if (!e.isHidden()) {
            System.out.println(id + ".- \t" + getFlags(e) + "\t" +  String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
        }
    }

    private static String getFlags(File e) {
        String flags;
        if(e.isDirectory()){
            flags = "d";
        }else{
            flags = "-";
        }

        if(e.canRead()){
            flags += "r";
        }else{
            flags += "-";
        }

        if(e.canWrite()){
            flags += "w";
        }else{
            flags += "-";
        }

        if(e.canExecute()){
            flags += "x";
        }else{
            flags += "-";
        }
        return flags;
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