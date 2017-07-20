package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Salary after 5 years
Enter the name, number1, number2 separately from the keyboard. Print the inscription:
"Name" gets "number1" in "number2" years.
Example: Kolya gets 3000 in 5 years.
*/

public class Lesson08Task02 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " gets " + num1 + " in " + num2 + " years.");
	}

}
