import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println(" Enter a name :");
        String name = SC.nextLine();
        for(int i= 1; i<=10; i ++){
            System.out.print(name+",");
        }





    }
}