public class NewMethod {
    public static void main(String[] args) {
        displayName("Ram"); displayYear( 6);

    }
    public static void displayName(String n){

        System.out.print("Hello " + n +",");
    }
    public static void displayYear(int y){
        int year= 2023- y;
        System.out.println("You are born on year " +year+".");
    }

}