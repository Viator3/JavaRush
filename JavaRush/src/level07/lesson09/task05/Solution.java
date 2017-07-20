package level07.lesson09.task05;

import java.io.*;
import java.util.ArrayList;

/* Double the word
1. Enter 10 words from the keyboard into the list of lines.
2. The doubleValues method must double words according to the principle a, b, c -> a, a, b, b, c, c.
3. Using the for loop, print the result to the screen, each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int num = 0; num < 10; num++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String line : result) {
            System.out.println(line);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int num = 0; num < list.size(); num++){
            list.add(num, list.get(num++));
        }
        return list;
    }
}
