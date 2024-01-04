import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println(" Enter a character :");
        String str1 = SC.nextLine().toLowerCase();
        str1= str1.charAt(0)+"";
        if ( str1.equals("a") || str1.equals("e") || str1.equals("i") || str1.equals("o") || str1.equals("u")) {
            System.out.println("vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
