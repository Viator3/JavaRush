package level07.lesson04.task05;

import java.io.*;

/* One large array and two small ones
1. Create an array of 20 numbers.
2. Enter the values from the keyboard.
3. Create two arrays of 10 numbers each.
4. Copy a large array into two small ones: half the numbers in the first small,
the second half into the second small.
5. Display the second small array on the screen, output each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        int[] numbersSmall1 = new int[10];
        int[] numbersSmall2 = new int[10];

        for (int num = 0; num < numbers.length; num++) {
            numbers[num] = Integer.parseInt(reader.readLine());
        }

        for (int num = 0; num < numbers.length; num++) {
            if (num < 10) {
                numbersSmall1[num] = numbers[num];
            } else {
                System.out.println(numbersSmall2[num - 10] = numbers[num]);
            }
        }
    }
}
