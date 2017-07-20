package level07.lesson06.task01;

import java.util.ArrayList;

/* 5 different lines in the list
1. Create a list of strings.
2. Add 5 different lines to it.
3. Display its size on the screen.
4. Using the cycle, display its contents on the screen, each value from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("5 different lines in the list");
        list.add("1. Create a list of strings.");
        list.add("2. Add 5 different lines to it.");
        list.add("3. Display its size on the screen.");
        list.add("4. Using the cycle, display its contents on the screen, each value from a new line.");

        System.out.println(list.size());

        for (String line : list) {
            System.out.println(line);
        }
    }
}
