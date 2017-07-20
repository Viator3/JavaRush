package level09.lesson11.home04;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/* Date converter
Enter the date in the format "08/18/2013"
Display this date in the form of "AUG 18, 2013".
Use the Date object and SimpleDateFormat.
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        dataChange(dateEnter());
    }

    private static String dateEnter() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void dataChange(String date)
    {
        @SuppressWarnings("deprecation")
		Date oldDate = new Date(date);

        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(newDateFormat.format(oldDate).toUpperCase());
    }
}
