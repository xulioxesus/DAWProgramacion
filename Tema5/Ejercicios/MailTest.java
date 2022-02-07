public class MailTest {
    public static void main(String[] args) {
        
        MailServer server = new MailServer();

        MailClient julio = new MailClient(server, "Julio J. León");
        MailClient manuel = new MailClient(server, "Manuel López");

        System.out.println(server.howManyMailItems("Pepito"));

        julio.sendMailItem("Pepito;Juan;Maria", "Holiiiiii", "Bla bla bla bla bla bla");
        manuel.sendMailItem("Pepito", "Chau", "No te hablo más");

        System.out.println(server.howManyMailItems("Pepito"));

        MailItem temp = server.getNextMailItem("Pepito");
        temp.print();

        System.out.println(server.howManyMailItems("Pepito"));

    }
}
