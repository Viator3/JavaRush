package level08_1.lesson03.task06;

import java.util.*;

/* HashMap Collection from Object
There is a collection of HashMap<String, Object>, there are 10 different pairs of objects.
Display the contents of the collection on the screen, each element from a new line.
Example output (only one line is shown here):
Sim - 5
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
