package level08.lesson03.task02;

import java.util.*;

/* HashMap of 10 pairs
Create a collection HashMap<String, String>, add 10 pairs of rows:
watermelon - berry, banana - grass, cherry - berry, pear - fruit, melon - vegetable,
blackberry - bush, ginseng - root, strawberry - berry, iris - flower, potatoes - tuber.
Display the contents of the collection on the screen, each element from a new line.
Example output (only one line is shown here):
potato - tuber
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        Map<String, String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("banana", "grass");
        map.put("cherry", "berry");
        map.put("pear", "fruit");
        map.put("melon", "vegetable");
        map.put("blackberry", "bush");
        map.put("ginseng", "root");
        map.put("strawberry", "berry");
        map.put("iris", "flower");
        map.put("potatoes", "tuber");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
