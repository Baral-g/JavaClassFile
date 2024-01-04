import java.time.LocalDate;
import java.time.LocalDateTime;

public class Year {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime datetime = LocalDateTime.now();
        //System.out.println("Local Date is "+date);
        //System.out.println("Local DateTime is "+datetime);

        // date.getYear will give us year in int type.
        int currentYear = date.getYear();
        int currentMonth = date.getMonthValue();
        int currentDay = date.getDayOfMonth();
        System.out.println("Current Year is "+currentYear);
        System.out.println("Current Month is "+ currentMonth );
        System.out.println("Current Day is "+ currentDay );
    }
}
