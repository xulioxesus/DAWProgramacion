public class E05Iguales {
    public static void main(String[] args) {
        int [] primero = {1,2,3,4};
        int [] segundo = {1,2,3,4};
        boolean iguales = true;

        if (primero.length != segundo.length){
            System.out.println("No son iguales");
        }else{
            for (int i = 0; i < primero.length; i++) {
                if (primero[i] != segundo[i]){
                    iguales = false;
                    break;
                }
            }

            if (iguales){
                System.out.println("Son iguales");
            }else{
                System.out.println("No son iguales");
            }
        }
    }
}
