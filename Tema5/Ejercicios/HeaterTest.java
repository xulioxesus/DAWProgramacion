public class HeaterTest {
    public static void main(String[] args) {
        Heater calefactor = new Heater(11, 26);
        calefactor.setIncrement(4);
        calefactor.warmer();
        calefactor.warmer();
        calefactor.warmer();
    }
}
