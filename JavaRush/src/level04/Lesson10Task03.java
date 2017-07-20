package level04;

import java.io.*;

/* There is not much good
Enter the string and the number N.
Display the N line on the screen using the while loop.
Example input:
abc
2
Example output:
abc
abc
*/

public class Lesson10Task03 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            System.out.println(line);
        }
    }
}
