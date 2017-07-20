package level04;

import java.io.*;

/* String - description
Enter an integer from the keyboard in the range 1 - 999. Output its string-description of the following form:
"Even single-valued number" - if the number is even and has one digit,
"Odd single-valued number" - if the number is odd and has one digit,
"Even two-digit number" - if the number is even and has two digits,
"Odd two-digit number" - if the number is odd and has two digits,
"Even three-digit number" - if the number is even and has three digits,
"Odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall into the range 1 - 999, in this case do not display anything.
Example for the number 100:
Even three-digit number
Example for number 51:
Odd two-digit number
*/

public class Lesson07Task02 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num > 0 && num < 10 && num % 2 == 0) System.out.println("Even single-valued number");
        if (num > 0 && num < 10 && num % 2 != 0) System.out.println("Odd single-valued number");
        if (num >= 10 && num < 100 && num % 2 == 0) System.out.println("Even two-digit number");
        if (num >= 10 && num < 100 && num % 2 != 0) System.out.println("Odd two-digit number");
        if (num >= 100 && num < 1000 && num % 2 == 0) System.out.println("Even three-digit number");
        if (num >= 100 && num < 1000 && num % 2 != 0) System.out.println("Odd three-digit number");
    }
}
