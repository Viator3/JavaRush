package level07.lesson09.task04;

import java.util.ArrayList;
import java.util.Collections;

/* The letter "p" and the letter "l"
1. Create a list of words, fill it yourself.
2. The fix method should:
2.1. Delete all words containing the letter "p" from the list of strings.
2.2. Double all words containing the letter "l".
2.3. If the word contains both the letter "p" and the letter "l", then leave this word unchanged.
2.4. With other words, do nothing.
Example:
peace
world
people
Output:
world
world
people
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "peace", "world", "people");
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        for (int num = 0; num < list.size(); num++) {
            String line = list.get(num);
            if (line.contains("p")) {
                if (line.contains("l")) {}
                else list.remove(num--);
            } else {
                if (line.contains("l")) {
                    list.add(num++, line);
                }
            }
        }
        return list;
    }
}
