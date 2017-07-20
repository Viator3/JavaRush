package level07.lesson12.home04;

import java.io.*;
import java.util.ArrayList;

/* Enter a string from the keyboard until the user enters the string 'end'
Create a list of strings.
Enter the lines from the keyboard and add them to the list.
Enter a string from the keyboard until the user enters the string "end". 
"End" is not taken into account.
Display the lines on the screen, each with a new line.
*/

public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String line = reader.readLine();
            if (line.equals("end")) break;
            list.add(line);
        }
        for (String line : list) {
            System.out.println(line);
        }
    }
}
