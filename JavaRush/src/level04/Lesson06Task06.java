package level04;

import java.io.*;

/* And 18 is enough
Enter the name and age from the keyboard. If the age is more than 20, 
print the inscription "And 18 is enough name".
*/

public class Lesson06Task06 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age > 20) System.out.println("And 18 is enough " + name);
    }
}
