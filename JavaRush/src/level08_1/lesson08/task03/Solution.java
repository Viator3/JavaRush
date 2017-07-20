package level08_1.lesson08.task03;
/* Identical first and last name
Create a dictionary (Map<String, String>) to enter into it ten records on the
principle of "Last Name" - "Name".
Check how many people have the same name as the given name.
The result is displayed on the screen.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
	static int getCountTheSameFirstName = 0;
    static int getCountTheSameLastName = 0;

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Folk", "Dima");
        map.put("Folk1", "Dima1");
        map.put("Fol2k", "Dima");
        map.put("Folk3", "Serg");
        map.put("Folk4", "Dima");
        map.put("Folk5", "Dima");
        map.put("Folk6", "Dima");
        map.put("Folk7", "Vova");
        map.put("Folk8", "Dima");
        map.put("Folk9", "Dima");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if(pair.getValue().equals(name)) {
                getCountTheSameFirstName++;
            }
        }
        return getCountTheSameFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                getCountTheSameLastName++;
            }
        }
        return getCountTheSameLastName;
    }

    public static void main(String[] args) {

        System.out.println(getCountTheSameFirstName(createMap(), "Dima"));
        System.out.println(getCountTheSameLastName(createMap(), "Folk"));
    }
}
