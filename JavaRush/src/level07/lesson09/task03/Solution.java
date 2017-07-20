package level07.lesson09.task03;

import java.util.*;

/* The word "exactly"
1. Create a list of the words "mom", "soap", "frame".
2. After each word, insert into the list a line containing the word "exactly".
3. Using the for loop to display the result on the screen, each item in the list with a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "mom", "soap", "frame");

        for (int num = 0; num < list.size(); num++) {
            list.add(++num, "exactly");
        }
        
        for (String line : list) {
            System.out.println(line);
        }
    }
}
