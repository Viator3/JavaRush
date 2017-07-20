package level05;

import java.util.Calendar;

/* Display today's date
Display the current date in a similar form "21 02 2014".
*/

public class Lesson12Home04 {
	public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day + " 0" + (month + 1) + " " + year);
    }
}
