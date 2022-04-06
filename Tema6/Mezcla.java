import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mezcla {
    public static void main(String[] args) {
        FileReader fileReader1;
        FileReader fileReader2;

        BufferedReader reader1;
        BufferedReader reader2;

        try {
            fileReader1 = new FileReader("f1.txt");
            fileReader2 = new FileReader("f2.txt");

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);

            System.out.println(reader1.readLine());
            System.out.println(reader2.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
