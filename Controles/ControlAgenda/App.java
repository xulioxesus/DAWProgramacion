import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.pedirUsuario();
        
        try {
            agenda.imprimirListadoTexto();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            agenda.imprimirListadoObjetos();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        agenda.terminar();
    }
}