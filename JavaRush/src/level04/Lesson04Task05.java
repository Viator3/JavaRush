package level04;

import java.io.*;

/* Positive and negative number
Enter the number from the keyboard. If the number is positive, then double it.
If the number is negative, add one.
Output the result on the screen.
*/

public class Lesson04Task05 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num > 0) {
            System.out.println(num *= 2);
        }
        if (num < 0) {
            System.out.println(num += 1);
        }
    }
}
