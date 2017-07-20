package level04;

import java.io.*;

/* Positive and negative numbers
Enter three integers from the keyboard. Display the number of positive and
The number of negative numbers in the source set,
In the following form:
"The number of negative numbers: a", "the number of positive numbers: b", where a, b - the desired values.
Example for numbers 2 5 6:
Number of negative numbers: 0
Number of positive numbers: 3
Example for numbers -2 -5 6:
Number of negative numbers: 2
Number of positive integers: 1
*/

public class Lesson07Task04 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int evenNum = 0, oddNum = 0;

        for (int x = 0; x < 3; x++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > 0) evenNum++;
            if (num < 0) oddNum++;
        }
        System.out.println("количество отрицательных чисел: " + oddNum);
        System.out.println("количество положительных чисел: " + evenNum);
    }
}
