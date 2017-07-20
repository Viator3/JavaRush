package level04;

import java.io.*;

/* Draw a rectangle
Enter two numbers m and n from the keyboard.
Using the for loop to display a rectangle of size m to n from the eight.
Example: m = 2, n = 4
8888
8888
*/

public class Lesson13Task02 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int n1 = n;
        for (; m > 0; m--) {
            for (n = n1; n > 0; n--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
