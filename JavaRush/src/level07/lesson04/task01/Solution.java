package level07.lesson04.task01;

import java.io.*;

/* Maximum among an array of 20 numbers
1. In the initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Count 20 numbers from the console and fill them with an array
2. The max(int [] array) method must find the maximum number of elements in the array
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] initializeArray = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int num = 0; num < initializeArray.length; num++) {
            initializeArray[num] = Integer.parseInt(reader.readLine());
        }
        return initializeArray;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
}
