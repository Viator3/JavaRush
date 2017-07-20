package level05;

import java.io.*;

/* Problem on algorithms
Write a program that:
1. enters from the console the number N > 0
2. then enters N numbers from the console
3. Displays the maximum of the N numbers entered.
*/

public class Lesson12Bonus03 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n - 1; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > maximum) maximum = num;
        }

        System.out.println(maximum);
    }
}
