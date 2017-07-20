package level10.lesson11.bonus03;

import java.io.*;
import java.util.Arrays;

/* Problem on algorithms
Task: enter from the keyboard 30 numbers. Output the 10th and 11th minimum numbers.
Explanation:
The lowest number is the 1-st minimum.
The next minimum after it is the 2nd minimum
Example:
1 6 5 7 1 15 63 88
The first minimum is 1
The second minimum is 1
The third minimum is 5
The fourth minimum is 6
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    int[] array = new int[30];
	    for (int i = 0; i < 30; i++) {
	    	array[i] = Integer.parseInt(reader.readLine());
	    }
	        
	    sort(array);

	    System.out.println(array[9]);
	    System.out.println(array[10]);
	    }

	 public static void sort(int[] array) {
	    Arrays.sort(array);
	 }
}
