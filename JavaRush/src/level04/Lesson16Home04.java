package level04;

import java.io.*;

/* My name is Vasya'...
Enter the string name from the keyboard.
Enter the date of birth (three numbers) from the keyboard: y, m, d.
Display the text:
"My name is "name"
I was born on d.m.y »
Example:
My name is Vasya
I was born on 15.2.1988
*/

public class Lesson16Home04 {
	public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());

        System.out.println("My name is " + name + "\nI was born on " + day + "." + month + "." + year);
    }
}
