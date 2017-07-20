package level04;

import java.io.*;

/* Compare names
Enter two names from the keyboard, and if the names are identical, 
print the message "Names are identical."
If the names are different, but their lengths are equal - print out the message - "Names are equal".
*/

public class Lesson06Task04 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)) {
            System.out.println("Names are identical.");
        } else {
            if (name1.length() == name2.length()) {
                System.out.println("Names are equal.");
            }
        }
    }
}
