import java.sql.SQLOutput;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your address: ");
        String streetName= sc.nextLine();

        System.out.println( "Your address is " + streetName);
    }
}
