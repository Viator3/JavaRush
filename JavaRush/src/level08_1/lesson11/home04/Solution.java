package level08_1.lesson11.home04;

import java.io.*;
import java.util.*;

/* The minimum of N numbers
1. Enter the number N.
2. Read N integers and fill them with a list - the getIntegerList method.
3. Find the minimum number among the list items - the getMinimum method.
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        /*int min = array.get(0);
        for (int minimum : array) {
            if (minimum < min) {
                min = minimum;
            }
        }*/
        Collections.sort(array);

        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integers = new LinkedList<>();
        int num = Integer.parseInt(reader.readLine());
        for (;num > 0; num--) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        return integers;
    }
}
