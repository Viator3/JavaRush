package level08_1.lesson11.home03;

import java.util.*;

/* People with the same name and / or surname
1. Create a Map dictionary (<String, String>) and add 10 people in the form "Last Name" - "First Name".
2. Let among these 10 people there are people with the same names.
3. Let among these 10 people there are people with identical surnames.
4. Display the contents of the Map on the screen.
*/

public class Solution {
	public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Folk", "Dima");
        map.put("Folk1", "Dima1");
        map.put("Fol2k", "Dima");
        map.put("Folk3", "Serg");
        map.put("Folk4", "Dima");
        map.put("Folk", "Serg");
        map.put("Folk6", "Dima");
        map.put("Folk7", "Vova");
        map.put("Folk", "Dima");
        map.put("Folk9", "Dima");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
