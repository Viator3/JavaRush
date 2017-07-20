package level07.lesson04.task03;

import java.io.*;

/* 2 array
1. Create an array of 10 lines.
2. Create an array of 10 numbers.
3. Enter 10 lines from the keyboard, fill them with an array of lines.
4. In each cell of the array of numbers write the length of the string from the array of rows,
The index / cell number of which coincides with the current index from the array of numbers.
Output the contents of an array of numbers on the screen, each value to output from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] numbers = new int[10];

        for (int num = 0; num < list.length; num++) {
            list[num] = reader.readLine();
            numbers[num] = list[num].length();
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
