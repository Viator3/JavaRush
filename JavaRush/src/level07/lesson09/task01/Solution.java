package level07.lesson09.task01;

import java.io.*;
import java.util.*;

/* Three arrays
1. Enter from the keyboard 20 numbers, save them in the list and sort them out on three other lists:
The number is divided by 3 (x % 3 == 0), divided by 2 (x % 2 == 0) and all the others.
Numbers that are divided into 3 and 2 simultaneously, for example 6, fall into both lists.
2. The printList method should display all the list items from a new line.
3. Using the printList method, display these three lists on the screen.
First, the one that is for x % 3, then the one that is for x % 2, then the last one.
*/

public class Solution {
	 public static void main(String[] args) throws Exception
	    {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        List<Integer> list = new ArrayList<>();
	        List<Integer> listMultipleThree = new ArrayList<>();
	        List<Integer> listMultipleTwo = new ArrayList<>();
	        List<Integer> listOtherNum = new ArrayList<>();
	        
	        for (int num = 0; num < 20; num++) {
	            list.add(Integer.parseInt(reader.readLine()));
	        }
	        
	        for (int num : list) {
	            if (num % 3 == 0) listMultipleThree.add(num);
	            if (num % 2 == 0) listMultipleTwo.add(num);
	            if (num % 3 != 0 && num % 2 != 0) listOtherNum.add(num);
	        }
	        
	        printList(listMultipleThree);
	        printList(listMultipleTwo);
	        printList(listOtherNum);
	    }

    public static void printList(List<Integer> list)
    {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
