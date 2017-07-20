package level10.lesson11.home10;

import java.io.*;
import java.util.ArrayList;

/* Safely remove from the list
Create a list of integers. Enter from the keyboard 20 integers. 
Create a method for safe extraction of numbers from the list:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
The method must return a list item (list) by its index (index).
If an exception occurs during the retrieval of the element, 
it must be intercepted, and the method should return defaultValue.
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            return list.get(index);
        }
        catch (IndexOutOfBoundsException e) {
            return defaultValue;
        }
    }
}
