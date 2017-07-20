package level08.lesson11.home08;

import java.io.*;
import java.util.Arrays;

/* The five largest numbers
Create an array of 20 numbers. Fill it with numbers from the keyboard. Output the five largest numbers.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int t, i = 0, j = array.length - 1; i < j; i++, j--) {
            t = array[i];
            array[i] = array[j];
            array[j] = t;
        }
    }
}
