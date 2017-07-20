package level04;

import java.io.*;

/* 18+
Enter the name and age from the keyboard. If the age is less than 18, 
print the inscription "Grow up more name"
*/

public class Lesson06Task05 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age < 18) System.out.println("Grow up more " + name);
    }
}
