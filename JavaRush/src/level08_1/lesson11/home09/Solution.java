package level08_1.lesson11.home09;

import java.util.Date;

/* Working with the date
1. Implement the isDateOdd (String date) method so that it returns true if the number
of days since the beginning of the year is an odd number, otherwise false.
2. String date is transmitted in the format "May 1 2013".
3. Output the result on the screen.
Do not forget to take into account the first day of the year.
Example:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
	public static void main(String[] args)
    {
        System.out.println(isDateOdd("May 1 2020"));
    }
	
	@SuppressWarnings("deprecation")
    public static boolean isDateOdd(String date) {
        Date dateSpecified = new Date(date);
        String dateChange = "January 1 " + date.substring(date.length() - 4, date.length());
		Date dateModified = new Date(dateChange);
        if ((dateSpecified.getTime() - dateModified.getTime()) / (1000 * 60 * 60 * 24) % 2 == 0) {
        	return true;
        }
        else return false;
    }
}
