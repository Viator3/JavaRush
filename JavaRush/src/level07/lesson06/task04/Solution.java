package level07.lesson06.task04;

import java.io.*;
import java.util.ArrayList;

/* 10 lines to the top of the list
1. Create a list of strings in the main method.
2. Add 10 lines to it from the keyboard, but only add to the top of the list, not the end.
3. Using the cycle, display the contents on the screen, each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String >();
        for (int num = 0; num < 10; num++) {
            list.add(0, reader.readLine());
        }
        for (String line : list) {
            System.out.println(line);
        }
    }
}
