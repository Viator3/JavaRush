package level08.lesson03.task01;
/* HashSet from plants
Create a HashSet collection with the type of String elements.
Add to it 10 lines: watermelon, banana, cherry, pear, melon,
blackberries, ginseng, strawberries, iris, potatoes.
Display the contents of the collection on the screen, each element from a new line.
See how the order of the added items has changed.
*/

import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "watermelon", "banana", "cherry", "pear", "melon", "blackberries",
        		"ginseng", "strawberries", "iris", "potatoes");
        for (String text : set) {
            System.out.println(text);
        }
    }
}
