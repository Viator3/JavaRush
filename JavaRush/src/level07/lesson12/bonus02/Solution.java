package level07.lesson12.bonus02;

import java.io.*;
import java.util.ArrayList;

/* I need to replace the functionality of the program
Task: The program enters the lines until the user enters an empty string (by pressing enter).
Then it converts the lines to upper case (Mom turns into MAMA) and displays them on the screen.
New task: The program enters the lines until the user enters an empty string (by pressing enter).
Then the program builds a new list. 
If the line contains an even number of letters, the string doubles, if the odd number is tripled.
The program displays the contents of the new list on the screen.
Example input:
Cat
Cats
Example output:
Cat Cat Cat
Cats Cats
*/
public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listResult = new ArrayList<String>();

        for (String line : list) {
            if (line.length() % 2 == 0) {
            	listResult.add(line.concat(" " + line));
            } else {
                listResult.add(line.concat(" " + line + " " + line));
            }
        }
        
        for (String line : listResult) {
        	System.out.println(line);
        }
    }
}
