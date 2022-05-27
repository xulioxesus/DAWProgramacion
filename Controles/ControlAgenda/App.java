import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        //agenda.pedirUsuario();
        //agenda.terminar();
        try {
            agenda.imprimirListadoTexto();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}