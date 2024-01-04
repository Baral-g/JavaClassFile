import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
       //finds simple interest. Formula= (p * t * r) / 100
       double principalAmount = 60000;
       double time = 2;
       double rate = 4.9;
       double yearly = (principalAmount*time*rate)/100;
       double daily = (yearly)/365;
       double monthly = yearly/12;
       double semiYear = yearly/6;
       double multipleYear = yearly*6;
        System.out.println("One day=$" + daily);
        System.out.println("One month=$" + monthly);
        System.out.println("Six months=$" + semiYear);
        System.out.println("One year=$" + yearly);
        System.out.println("Six Year=$" + multipleYear);
    }
}

