package level09.lesson11.home08;

import java.util.*;

/* List of arrays of numbers
Create a list whose elements are numbers arrays.
Add to the list five array objects of length 5, 2, 4, 7, 0, respectively.
Fill the arrays with any data and display them on the screen.
*/

public class Solution {
	public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        Collections.addAll(list, new int[5], new int[2], new int[4], new int[7], new int[0]);
        
        for (int[] numbers : list) {
            for (int num = 0; num < numbers.length; num++) {
                numbers[num] = num;
            }
        }

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array: list ) {
            for (int x: array) {
                System.out.println(x);
            }
        }
    }
}
