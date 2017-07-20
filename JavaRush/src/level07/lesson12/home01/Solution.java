package level07.lesson12.home01;

import java.io.*;
import java.util.ArrayList;

/* Print the numbers in reverse order
Enter 10 numbers from the keyboard and fill them with a list.
Remove them in the reverse order.
Use only the for loop.
*/

public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int num = 0; num < 10; num++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (int num = 1; num <= numbers.size(); num++) {
            System.out.println(numbers.get(numbers.size() - num));
        }
    }
}
