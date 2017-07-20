package level07.lesson06.task05;

import java.io.*;
import java.util.ArrayList;

/* Delete the last line and insert it at the beginning
1. Create a list of strings.
2. Add 5 lines to the keyboard.
3. Delete the last line and insert it to the beginning. Repeat 13 times.
4. Using the cycle, display the contents on the screen, each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int num = 0; num < 5; num++) {
            list.add(reader.readLine());
        }
        for (int num = 0; num < 13; num++) {
            String line = list.remove(list.size() - 1);
            list.add(0, line);
        }
        for (String line : list) {
            System.out.println(line);
        }
    }
}
