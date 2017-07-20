package level05;

import java.io.*;

/* You need to fix the program to compile and work
Task: The program enters two numbers from the keyboard and displays their sum on the screen.
*/

public class Lesson12Bonus01 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = reader.readLine();
        //int b = reader.read();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
