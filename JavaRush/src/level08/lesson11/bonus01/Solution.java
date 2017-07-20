package level08.lesson11.bonus01;

import java.io.*;
import java.util.*;

/* Number of the month
The program enters the name of the month from the keyboard and displays its number on the 
screen in the form: "May is 5 month".
Use collections.
*/

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "January", "February", "March", "April", "May", "June", "July",
        		"August", "September", "October", "November", "December");
        System.out.println(month + " is " + (list.indexOf(month) + 1) + " month");
    }
}
