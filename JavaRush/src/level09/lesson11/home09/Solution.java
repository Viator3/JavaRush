package level09.lesson11.home09;

import java.util.*;

/* Ten cats
Create cat class - Cat, with the field "name" (String).
Create a dictionary Map(<String, Cat>) and add 10 cats in the form "Name" - "Cat".
Get from Map a set (Set) of all names and display it on the screen.
*/

public class Solution {
	public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        for (int index = 0; index < 10; index++) {
            map.put("Vaska" + index, new Cat("Vaska" + index));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Cat cat : map.values()) {
            set.add(cat);
       }
       return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat:set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat "+this.name;
        }
    }
}
