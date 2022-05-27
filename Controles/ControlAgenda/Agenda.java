import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Agenda {

    private final String nombreFicheroTexto = "agenda.dat";
    private final String nombreFicheroObjetos = "agendaObjetos.dat";

    private Scanner lector;

    private FileWriter ficheroTexto;
    private PrintWriter escritorTexto;

    

    private FileOutputStream ficheroObjetos;
    private ObjectOutputStream escritorObjetos;

    public Agenda() {
        this.lector = new Scanner(System.in);

        try {
            this.ficheroTexto = new FileWriter(nombreFicheroTexto,true);
            escritorTexto = new PrintWriter(this.ficheroTexto);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            this.ficheroObjetos = new FileOutputStream(nombreFicheroObjetos, true);
            this.escritorObjetos = new ObjectOutputStream(this.ficheroObjetos);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Usuario pedirUsuario() {
        Usuario nuevoUsuario = new Usuario();
        
        System.out.println("Nombre: ");
        nuevoUsuario.setNombre(lector.nextLine());

        System.out.println("Apellidos: ");
        nuevoUsuario.setApellidos(lector.nextLine()); 

        System.out.println("Teléfono: ");
        nuevoUsuario.setTelefono(lector.nextLine()); 

        System.out.println("Email: ");
        nuevoUsuario.setEmail(lector.nextLine());

        this.escritorTexto.println(nuevoUsuario);

        try {
            this.escritorObjetos.writeUnshared(nuevoUsuario);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return nuevoUsuario;
    }

    public void imprimirListadoTexto() throws IOException{

        BufferedReader lectorTexto = new BufferedReader(new FileReader(this.nombreFicheroTexto));
        
        String linea = lectorTexto.readLine();
        
        while (linea != null){
            String[] elementos = linea.split("\t");
            System.out.println(elementos[0] + "," +
                                elementos[1] + "," + 
                                elementos[2] + "," +
                                elementos[3]);
            linea = lectorTexto.readLine();
        }

        lectorTexto.close();
    }

    public void imprimirListadoObjetos() throws FileNotFoundException, IOException {
        ObjectInputStream lectorObjetos = new ObjectInputStream(new FileInputStream(nombreFicheroObjetos));

        while(true){
            try {
                Usuario usuario = (Usuario) lectorObjetos.readObject();

                System.out.println(usuario.getNombre() + "-" +
                                usuario.getApellidos() + "-" + 
                                usuario.getTelefono() + "-" +
                                usuario.getEmail());

            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (EOFException e) {
                lectorObjetos.close();
            }
        }
    }

    public void terminar(){
        try {
            this.escritorObjetos.close();
            this.ficheroObjetos.close();
            this.ficheroTexto.close();
            this.ficheroObjetos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
