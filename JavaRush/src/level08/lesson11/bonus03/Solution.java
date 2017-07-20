package level08.lesson11.bonus03;

import java.io.*;

/* Problem on algorithms
Task: Enter from the keyboard 20 words and output them in alphabetical order,
 first by capital letters, then by lowercase.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
    	boolean replaceNum = true;
    	while (replaceNum) {
    		replaceNum = false;
            for (int num = 0; num < array.length - 1; num++) {
                if (isGreaterThan(array[num], array[num + 1])) {
                    String temp = array[num];
                    array[num] = array[num + 1];
                    array[num + 1] = temp;
                    replaceNum = true;
                }
            } 
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
