/**
 * ArgumentosMain
 */
public class ArgumentosMain {
    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("Argumentos: " + args.length);
        System.out.println("===========================");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("---------------------------");
    }
}