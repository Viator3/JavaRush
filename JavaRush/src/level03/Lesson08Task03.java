package level03;

import java.io.*;

/* Modesty decorates the person
Enter the name on the keyboard and display the text:
Name earns $ 5,000. Ha-ha-ha!
Example: Timur earns $ 5,000. Ha-ha-ha!
*/

public class Lesson08Task03 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name + " earns $ 5,000. Ha-ha-ha!");
	}

}
