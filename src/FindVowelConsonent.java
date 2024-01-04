import java.util.Scanner;

public class FindVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = sc.nextLine().toLowerCase();
        int vo = 0;
        int co = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vo++;
            } else  {
                co++;
            }
        }
        System.out.println("Vowel:" +vo);
        System.out.println("Consonent:"+co);
    }
}
