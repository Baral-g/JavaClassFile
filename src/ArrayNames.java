import java.util.Scanner;

public class ArrayNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"","","","",""};
        for (int i=0; i< fruits.length; i++){
            System.out.println("Enter first fruits" +(i+1));
            fruits[i]= sc.nextLine();
        }
        for(int i=0; i< fruits.length; i++){
            System.out.println("fruit"+(i+1)+" :" +fruits[i]);
        }
    }
}
