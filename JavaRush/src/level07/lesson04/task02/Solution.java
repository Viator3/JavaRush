package level07.lesson04.task02;

import java.io.*;

/* An array of lines in reverse order
1. Create an array of 10 lines.
2. Enter 8 lines from the keyboard and save them to an array.
3. Display the contents of the entire array (10 items) on the screen in reverse order. 
Each element is a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int num = 0; num < 8; num++) {
            list[num] = reader.readLine();
        }
        for (int num = 9; num >= 0; num--) {
            System.out.println(list[num]);
        }
    }
}
