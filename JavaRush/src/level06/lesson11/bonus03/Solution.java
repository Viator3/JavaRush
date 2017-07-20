package level06.lesson11.bonus03;



/* Problem on algorithms
Task: Write a program that enters 5 numbers from the keyboard and displays them in ascending order.
Example input:
3
2
15
6
17
Example output:
2
3
6
15
17
*/

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception
    {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numbers = new ArrayList<Integer>();

		for (int index = 0; index < 5; index++) {
			numbers.add(Integer.parseInt(reader.readLine()));
		}

		Collections.sort(numbers);

		for (int num : numbers) {
			System.out.println(num);
		}
    }
}
