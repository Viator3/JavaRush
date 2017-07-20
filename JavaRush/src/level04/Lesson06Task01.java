package level04;

import java.io.*;

/* A minimum of two numbers
Enter two numbers from the keyboard, and display the minimum of them.
*/

public class Lesson06Task01 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > b) System.out.println(b);
        else System.out.println(a);
    }
}
