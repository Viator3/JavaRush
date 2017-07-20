package level05;

import java.io.*;

/* Enter numbers on the keyboard and read their sum
Enter the numbers from the keyboard and read their sum until the user enters the word "sum".
Display the received amount.
*/

public class Lesson12Home05 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String read = reader.readLine();
            if (read.equals("sum")) {
                System.out.println(sum);
                break;
            }
            int num = Integer.parseInt(read);
            sum += num;
        }
    }
}
