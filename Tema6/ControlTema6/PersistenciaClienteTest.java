import java.util.ArrayList;

public class PersistenciaClienteTest {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("12345678J", "Julio", "Leon", "0", "kk@gpuf.com");
        Cliente c2 = new Cliente("12345679J", "Juli", "Leo", "1", "pp@gpuf.com");
        Cliente c3 = new Cliente("12345673L", "Jul", "Le", "02", "ll@gpuf.com");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        PersistenciaCliente persistencia = new PersistenciaCliente();

        persistencia.write(clientes);
        clientes = persistencia.read();

        System.out.println("Fin del test");
    }
}
