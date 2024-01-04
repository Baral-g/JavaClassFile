import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.println(" A number :");
        double num = my.nextDouble();
        double square = num*num;
        System.out.println("The square of a number is " +square);
    }
}
