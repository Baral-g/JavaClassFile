import java.io.FileWriter;

public class FileWrite{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("name.txt");
            fw.write("My name is Ganesh");
            fw.close();
            System.out.println("Write Name ");

           // if (f.createNewFile()) {
                //System.out.println("File is created ");
           // } else {
               // System.out.println("file already exist.");
           // }
        } catch (Exception e) {
            System.out.println("error!!! ");
        }
    }
}
