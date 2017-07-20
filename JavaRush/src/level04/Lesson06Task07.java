package level04;

import java.io.*;

/* Three numbers
Enter three integers from the keyboard. One of the numbers is different from the other two, equal to each other.
Display the sequence number of a number different from the others.
Example for numbers 4 6 6:
1
Example for numbers 6 6 3:
3
*/

public class Lesson06Task07 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a != b && a != c) System.out.println("1");
        if (b != a && b != c) System.out.println("2");
        if (c != a && c != b) System.out.println("3");
    }
}
