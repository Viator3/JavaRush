package level04;

import java.io.*;

/* Three numbers
Enter three integers from the keyboard. 
Determine if there is at least one pair of equal numbers among them.
If such a pair exists, display the numbers with a space.
If all three numbers are equal, then output all three.
Example for numbers 1 2 2:
2 2
Example for numbers 2 2 2:
2 2 2
*/

public class Lesson04Task10 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else {
            if (a == b) System.out.println(a + " " + b);
            if (a == c) System.out.println(a + " " + c);
            if (b == c) System.out.println(b + " " + c);
        }
    }
}
