package level04;

import java.io.*;

/* Triangle
Enter from the keyboard three numbers a, b, c - the sides of the proposed triangle.
Determine the possibility of the existence of a triangle on the sides.
The result is displayed in the following form:
"The triangle exists." - if a triangle with such sides exists.
"The triangle does not exist." - if a triangle with such sides does not exist.
Hint: A triangle exists only when the sum of any two of its sides is greater than the third.
It is required to compare each side with the sum of the other two.
If, at least in one case, the party is greater than the sum of the other two,
Then there is no triangle with such sides.
*/

public class Lesson04Task08 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("The triangle does not exist.");
        } else  {
            System.out.println("The triangle exists.");
        }
    }
}
