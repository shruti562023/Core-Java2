package date;

import java.util.Calendar;


public class Cal {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        // Print current date
        System.out.println("Today: " +
            c.get(Calendar.DATE) + "/" +
            (c.get(Calendar.MONTH) + 1) + "/" +
            c.get(Calendar.YEAR)
        );

   
        c.add(Calendar.MONTH, 2);


        // Print new date
        System.out.println("After 2 Months: " +
            c.get(Calendar.DATE) + "/" +
            (c.get(Calendar.MONTH) + 1) + "/" +
            c.get(Calendar.YEAR)
        );
    }
}
