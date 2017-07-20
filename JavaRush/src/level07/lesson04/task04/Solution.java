package level07.lesson04.task04;

import java.io.*;

/* Array of numbers in reverse order
1. Create an array of 10 numbers.
2. Enter 10 numbers from the keyboard and write them into an array.
3. Arrange the array elements in the reverse order.
4. Output the result to the screen, output each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int[] numbersNew = new int[10];

        for (int num = 0; num < numbers.length; num++) {
           numbers[num] = Integer.parseInt(reader.readLine());
        }

        for (int num = 0; num < numbers.length; num++) {
            System.out.println(numbersNew[num] = numbers[9-num]);
        }
    }
}
