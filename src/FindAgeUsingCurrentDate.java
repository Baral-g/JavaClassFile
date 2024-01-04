import java.time.LocalDate;
import java.util.Scanner;

public class FindAgeUsingCurrentDate {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Birth Year: ");
    int birthYear = sc.nextInt();

    LocalDate date = LocalDate.now();
    int age = date.getYear() - birthYear;
    System.out.println("Your Age is : "+age);
}

}
