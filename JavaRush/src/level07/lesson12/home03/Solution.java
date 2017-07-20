package level07.lesson12.home03;

import java.io.*;
import java.util.ArrayList;

/* The maximum and minimum numbers in the array
Create an array of 20 numbers. Fill it with numbers from the keyboard.
Find the maximum and minimum numbers in the array.
Display the maximum and minimum numbers in the space bar.
*/

public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        int  maximum, minimum;
      
       for (int num = 0; num < 20; num++) {
           integers.add(Integer.parseInt(reader.readLine()));
       }

        minimum = integers.get(0);
        maximum = integers.get(0);

        for (int num : integers) {
           if (num > maximum) maximum = num;
           if (num < minimum) minimum = num;
        }
        
        System.out.print(maximum + " " + minimum);
    }
}
