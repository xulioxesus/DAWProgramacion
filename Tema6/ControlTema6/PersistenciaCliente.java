import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersistenciaCliente {

    private static final String nombreFichero = "clientes.dat";

    public void write(ArrayList<Cliente> clientes){

        FileWriter ficheroEscritura;
        BufferedWriter escritor;

        try {
            ficheroEscritura = new FileWriter(nombreFichero);
            escritor = new BufferedWriter(ficheroEscritura);

            for (Cliente cliente : clientes) {
                String linea = cliente.getId() + "," +
                                cliente.getNif() + "," +
                                cliente.getNombre() + "," +
                                cliente.getApellidos() + "," +
                                cliente.getEmail() + "\n";
                escritor.write(linea);
            }

            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Cliente> read(){

        ArrayList<Cliente> resultado = new ArrayList<>();

        FileReader ficheroLectura;
        BufferedReader lector;
        try {
            ficheroLectura = new FileReader(nombreFichero);
            lector = new BufferedReader(ficheroLectura);

            String linea;

            while ((linea = lector.readLine()) != null){
                String [] trozos = linea.split(",");
                Cliente cliente = new Cliente(trozos[1], trozos[2], trozos[3], trozos[0], trozos[4]);
                resultado.add(cliente);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}
