package level04;

import java.io.*;

/* Day of the week
Enter the number of the day of the week from the keypad, depending on the number output
The name "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "
If the number is entered more or less than 7 - output "there is no such day of the week".
Example for number 5:
Friday
Example for number 10:
There is no such day of the week
*/

public class Lesson04Task06 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numDayOfTheWeek = Integer.parseInt(reader.readLine());
        if (numDayOfTheWeek >= 1 && numDayOfTheWeek <= 7) {
            if (numDayOfTheWeek == 1) System.out.println("Sunday");
            if (numDayOfTheWeek == 2) System.out.println("Monday");
            if (numDayOfTheWeek == 3) System.out.println("Tuesday");
            if (numDayOfTheWeek == 4) System.out.println("Wednesday");
            if (numDayOfTheWeek == 5) System.out.println("Thursday");
            if (numDayOfTheWeek == 6) System.out.println("Friday");
            if (numDayOfTheWeek == 7) System.out.println("Saturday");
        } else {
            System.out.println("There is no such day of the week");
        }
    }
}
