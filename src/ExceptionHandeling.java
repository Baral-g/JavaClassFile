import java.util.Scanner;
public class ExceptionHandeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter birth year: ");
        try{
            int birthYear = sc.nextInt();
            int age = 2023 - birthYear;
            System.out.println("Your age is "+age);
        }catch (Exception ex){
            System.out.println("Wrong Input.");
        }
    }
}
