public class RandomNumber {
    public static void main(String[] args) {
        //int max = 100;
        //int min = 50;
        //using formula Math.random() * (max - min + 1) + min
        //double random = Math.random() * (100-50+1)+50;
           // System.out.println(random);
        //int number = (int) Math.ceil(random);

        System.out.println("Random numbers" );
        number();
    }
    public static void number() {
        int max = 100;
        int min = 50;
        int range = (max - min) + 1 +min;
        for (int i = 0; i < 6; i++) {
            int number = (int)(Math.random() * range);
            System.out.print(number + ", ");
        }
    }
}


