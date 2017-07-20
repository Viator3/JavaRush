package level08_1.lesson03.task04;

import java.util.*;

/* Display the list of keys
There is a collection of HashMap<String, String>, 10 different lines were entered there.
Display a list of keys, each item from a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map)
    {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
