public class Basico {

    public static int ejecuciones = 0;//Variable Global

    public static double miPI(){
        return 3.1415;
    }

    public static double suma3(double x, double y, double z){
        double res = 0; //Variable local
        res = x + y + z;
        res = res + miPI();
        ejecuciones++;

        return res;
    }
    
    public static void main(String[] args) {
        
        double resultado = suma3(3,5,6);//Variable local
        resultado = resultado + suma3(100,1,2);

        System.out.println(resultado);
        System.out.println(ejecuciones);
    }
    
}