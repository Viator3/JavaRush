package level04;

import java.io.*;

/* Maximum of four numbers
Enter four numbers from the keyboard, and output the maximum of them.
*/

public class Lesson06Task02 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > max) max = num;
        }
        System.out.println(max);
    }
}
