public class TicketMachineTest {
    public static void main(String[] args) {
        TicketMachine maquina = new TicketMachine();
        maquina.setPrice(100);
        maquina.prompt();
        maquina.insertMoney(200);
        maquina.insertMoney(100);
        maquina.printTicket();
        maquina.showPrice();
        maquina.empty();
        maquina.showPrice();
    }
}
