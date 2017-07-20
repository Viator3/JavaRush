package level03;

import java.io.*;

/* Sponsor - this sounds proudly
Enter two names from the keyboard and print out the inscription:
Name1 sponsored name2, and she became a famous singer.
Example:
Kolya sponsored Lena, and she became a famous singer.
*/

public class Lesson08Task04 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        System.out.println(name1 + " sponsored " + name2 + ", and she became a famous singer.");
	}

}
