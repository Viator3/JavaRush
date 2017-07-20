package level08.lesson08.task05;

import java.util.*;

/* Remove people with the same name
Create a dictionary (Map<String, String>) to enter into it ten records
on the principle of "last name" - "name".
Remove people with the same name.
The result is displayed on the screen.
*/

public class Solution {
	public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Folk", "Dima");
        map.put("Folk1", "Dima1");
        map.put("Fol2k", "Dima");
        map.put("Folk3", "Serg");
        map.put("Folk4", "Dima");
        map.put("Folk5", "Serg");
        map.put("Folk6", "Dima");
        map.put("Folk7", "Vova");
        map.put("Folk8", "Dima");
        map.put("Folk9", "Dima");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashSet<String> set = new HashSet<>();
        /*for (Map.Entry<String, String> pair : map.entrySet()) {
            int num = 0;
            for (Map.Entry<String, String> pair2 : map.entrySet()) {
                if (pair2.getValue().equals(pair.getValue())) {
                    num++;
                }
            }
            if (num > 1) {
                set.add(pair.getValue());
            }
        }*/
        for (String value : map.values()) {
        	if (Collections.frequency(map.values(), value) > 1) {
        		set.add(value);
        	}
        }
        
        for (String line : set) {
            removeItemFromMapByValue(map, line);
        }
        System.out.println(set);
        for (Map.Entry<String, String> pair : map.entrySet()) {
        	System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
