package level07.lesson12.bonus03;

import java.io.*;
import java.util.Arrays;

/* Problem on algorithms
Task: Write a program that enters 20 numbers from the keyboard and outputs them in descending order.
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sorting(array);

        for (int num = 0; num < array.length; num++) {
            if (num == array.length - 1) {
            	System.out.print(array[array.length - 1 - num]);
            } else {
            	System.out.print(array[array.length - 1 - num] + " ");
            }
        }
    }

    public static void sorting(int[] array) {
        Arrays.sort(array);
    }
}
