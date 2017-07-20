package level03;

import java.io.*;

/* Pure love
Enter three names from the keyboard, display:
Name1 + name2 + name3 = Pure love, yes-yes!
Example: Vasya + Eva + Angelica = Pure love, yes-yes!
*/

public class Lesson08Task05 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love, yes-yes!");
	}

}
