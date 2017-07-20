package level04;

import java.io.*;

/* Number of days in a year
Enter the year from the keyboard, determine the number of days in a year.
The result is displayed in the following form:
"Number of days in the year: x", where x is 366 for leap years, x is 365 for the regular year.
Tip: In a leap year - 366 days, whereas in the ordinary year - 365 days.
A leap year is every fourth year, except for centuries, which are not multiple 400.
Thus, the years 1700, 1800 and 1900 are not leap years, since they are multiples of 100 and not multiples of 400.
Years 1600 and 2000 are leap years, since they are multiples of 100 and multiples of 400.
The years 2100, 2200 and 2300 are non-leapable.
*/

public class Lesson04Task07 {
	public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(reader.readLine());
       int x;

       if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)) {
           x = 366;
           System.out.println("Number of days in the year: " + x);
       }
        if (num % 4 != 0 || (num % 100 == 0 && num % 400 != 0)) {
           x = 365;
            System.out.println("Number of days in the year: " + x);
        }
    }
}
