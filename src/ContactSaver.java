import java.io.FileWriter;
import java.util.Scanner;

public class ContactSaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter phone: ");
        String number = sc.nextLine();

        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        System.out.println("Enter income: ");
        String income = sc.nextLine();
        System.out.println("Enter income category: ");
        String incomeCategory = sc.nextLine();

        System.out.println("Enter expense: ");
        String expense = sc.nextLine();

        System.out.println("Enter expense category: ");
        String expanseCategory = sc.nextLine();

        System.out.println("Enter date: ");
        String date = sc.nextLine();

// Save it to File
        try{
//            FileWriter fw = new FileWriter("contact.csv",true);
//            fw.write(name+ ","+number+"," +email+ "\n");
//            fw.close();
            //System.out.println(name + income" is saved successfully.");
            FileWriter fm = new FileWriter("income.csv",true);
            fm.write(name+","+number+","+email+","+income+ ","+incomeCategory+"," +date+ "\n");
            fm.close();
            FileWriter fn = new FileWriter("expense.csv",true);
            fn.write(expense+ ","+expanseCategory+"," +date+ "\n");
            fn.close();
            System.out.println(name+"'s"+" "+ "income and expenses has been saved successfully.");
        }catch (Exception ex){
            System.out.println("Error!!!"+ ex.getMessage());
        }

    }

}

