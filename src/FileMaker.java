import java.io.File;

public class FileMaker{
    public static void main(String[] args) {
        try {
            File f = new File("contact.csv");

            if (f.createNewFile()) {
                System.out.println("File is created ");
            } else {
                System.out.println("file already exist.");
            }
        } catch (Exception e) {
            System.out.println("error!!! ");
        }
    }
}
