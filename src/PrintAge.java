import java.time.LocalDate;
import java.util.Scanner;

public class PrintAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Birth Year: ");
        double year = sc.nextDouble();
        LocalDate date = LocalDate.now();
        //System.out.println("Local Date is "+date);

        // date.getYear will give us year in int type.
        int currentYear = date.getYear();
        //System.out.println("Current Year is "+currentYear);
        double age = (currentYear-year);
        System.out.println("Your age is :" + age + ".");
    }
}
