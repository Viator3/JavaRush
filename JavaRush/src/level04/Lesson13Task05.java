package level04;

import java.io.*;

/* Everyone loves Mambu
Enter the name and use the for loop 10 times: [* name * loves me.]
Sample text:
Sveta loves me.
Sveta loves me.
...
*/

public class Lesson13Task05 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }
    }
}
