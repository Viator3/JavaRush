package level07.lesson12.home02;

import java.io.*;
import java.util.ArrayList;

/* Rearrange the first M lines to the end of the list
Enter from the keyboard 2 numbers N and M.
Enter N lines and fill them with a list.
Rearrange the first M lines at the end of the list.
Display a list on the screen, each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        for (int num = 0; num < num1; num++) {
            list.add(reader.readLine());
        }
        for (int num = 0; num < num2; num++) {
            list.add(list.remove(0));
        }
        for (String line : list) {
            System.out.println(line);
        }
    }
}
