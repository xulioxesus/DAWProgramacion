import java.io.File;
import java.io.IOException;

public class TransformaImagenTest {
    public static void main(String[] args) {
        File image = new File("./images.bmp");
        TransformaImagen ti = new TransformaImagen(image);
        try {
            ti.transformaNegativo();
            ti.transformaNegroBlanco();
            ti.transformaOscuro();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
