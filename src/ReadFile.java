import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("income.csv");
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String mydata = reader.nextLine();
                System.out.println(mydata);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("file not found "+e.getMessage());
        }
    }
}