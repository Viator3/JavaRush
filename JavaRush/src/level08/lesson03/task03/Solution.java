package level08.lesson03.task03;

import java.util.*;

/* Collection of HashMap from cats
There is a Cat class with a name field (name, String).
Create a collection of HashMap<String, Cat>.
Add 10 cats to the collection, use the name of the cat as the key.
Output the result on the screen, each element with a new line.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"vaska", "murka", "smoke", "redhead", "gray", "snowball", 
        		"boss", "boris", "visiting", "harfi"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        HashMap<String, Cat> map = new HashMap<>();
        for (String name : cats) {
            map.put(name, new Cat(name));
        }
        return map;
    }


    public static class Cat
    {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
