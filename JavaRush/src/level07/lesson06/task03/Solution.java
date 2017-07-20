package level07.lesson06.task03;

import java.io.*;
import java.util.ArrayList;

/* The shortest line
1. Create a list of strings.
2. Count 5 lines from the keyboard and add to the list.
3. Using the loop, find the shortest line in the list.
4. Bring up the found line to the screen.
5. If there are several such lines, output each new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int num = 0; num < 5; num++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();

        for (String line : list) {
            if (line.length() < min) min = line.length();
        }

        for (String line : list) {
            if (line.length() == min) System.out.println(line);
        }
    }
}
