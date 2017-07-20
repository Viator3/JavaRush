package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* How to capture the world
Enter the number and name from the keyboard, display the line:
"Name" will take over the world in "number" years. Moo-ha-ha!
Example: Vasya will take over the world in 8 years. Moo-ha-ha!

The sequence of input data is of great importance.
*/

public class Lesson08Task01 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println(name + " will take over the world in " + age + " years. Moo-ha-ha!");
	}

}
