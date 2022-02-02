public class MailTest {
    public static void main(String[] args) {
        
        MailServer server = new MailServer();

        MailClient client = new MailClient(server, "Julio J. León");

        System.out.println(server.howManyMailItems("Pepito"));

        client.sendMailItem("Pepito", "Holiiiiii", "Bla bla bla bla bla bla");

        System.out.println(server.howManyMailItems("Pepito"));

    }
}
