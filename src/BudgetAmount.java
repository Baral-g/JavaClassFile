import java.util.Scanner;

public class BudgetAmount {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Price: ");
        double price = SC.nextDouble();
        if (price>=500) {
            System.out.println("Budget is high!!");
        }else{
            //double otheramount <= 500;
            System.out.println(" Budget is Okey");
        }
    }
}
