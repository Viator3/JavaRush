package level03;

import java.io.*;

/* I will earn $50 per hour
Enter the number n on the keyboard.
Display the inscription "I will earn $n per hour" on the screen.
Example:
I will earn $50 per hour
*/

public class Lesson12Home03 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println("I will earn $" + n + " per hour");
	}

}
