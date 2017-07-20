package level04;

import java.io.*;

/* Calculate the sum of numbers
Enter numbers from the keyboard and count their sum.
If the user entered -1, display the amount and terminate the program.
-1 must be included in the total.
*/

public class Lesson16Home03 {
	public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0, result = 0;
        while (num != -1) {
            num = Integer.parseInt(reader.readLine());
            result += num;
        }
        System.out.println(result);
    }
}
