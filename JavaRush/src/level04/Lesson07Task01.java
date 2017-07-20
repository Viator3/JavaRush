package level04;

import java.io.*;

/* String - description
Enter an integer from the keyboard. Display its line-description of the following form:
"Negative even number" - if the number is negative and even,
"Negative odd number" - if the number is negative and odd,
"Zero number" - if the number is 0,
"Positive even number" - if the number is positive and even,
"Positive odd number" - if the number is positive and odd.
Example for the number 100:
Positive even number
Example for number -51:
Negative odd number
*/

public class Lesson07Task01 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String result = "Zero number";

        if (num < 0 && num % 2 == 0) result = "Negative even number";
        if (num < 0 && num % 2 != 0) result = "Negative odd number";
        if (num > 0 && num % 2 == 0) result = "Positive even number";
        if (num > 0 && num % 2 != 0) result = "Positive odd number";
        System.out.println(result);
    }
}
