package level04;

import java.io.*;

/* Positive numbers
Enter three integers from the keyboard. Display the number of positive numbers in the source set.
Example for numbers -4 6 6:
2
Example for numbers -6 -6 -3:
0
*/

public class Lesson07Task03 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int evenNum = 0;
        for (int x = 0; x < 3; x++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > 0) evenNum++;
        }
        System.out.println(evenNum);
    }
}
