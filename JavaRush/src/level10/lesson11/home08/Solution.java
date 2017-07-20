package level10.lesson11.home08;

import java.util.ArrayList;

/* Array of line lists
Create an array, whose elements are lists of strings. 
Fill the array with any data and display it on the screen.
*/

public class Solution {
	public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        @SuppressWarnings("unchecked")
		ArrayList<String>[] arrayOfStringList = new ArrayList[3];

        for (int numList = 0; numList < arrayOfStringList.length; numList++) {
            arrayOfStringList[numList] = new ArrayList<>();
            for (int numElements = 0; numElements < 3; numElements++) {
                arrayOfStringList[numList].add(String.valueOf(numList) + 
                		String.valueOf(numElements) + " " + Math.random() * 30);
            }
        }
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list: arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
