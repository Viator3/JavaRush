package level08.lesson08.task04;

import java.util.*;

/* Remove all people born in summer
Create a dictionary (Map<String, Date>) and record ten records based on the principle:
"surname" - "date of birth".
Remove from the dictionary all people born in the summer.
Output the result on the screen.
*/

@SuppressWarnings("deprecation")
public class Solution {

	public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("MAY 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 2010"));
        map.put("Stallone3", new Date("February 2 1980"));
        map.put("Stallone4", new Date("MAY 1 1955"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("January 15 1980"));
        map.put("Stallone7", new Date("JULY 1 1980"));
        map.put("Stallone8", new Date("MAY 31 1980"));
        map.put("Stallone9", new Date("AUGUST 1 1992"));
        map.put("Stallone10", new Date("MAY 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
    	/*HashMap<String, Date> copy = new HashMap<String, Date>(map);
    	for (Map.Entry<String, Date> pair : copy.entrySet()){
    		if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 
                	|| pair.getValue().getMonth() == 7) {
                    map.remove(pair.getKey());
                }
    	}*/
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 
            	|| pair.getValue().getMonth() == 7) {
                iterator.remove();
            }
        }
        for (Map.Entry<String, Date> pair : map.entrySet()) {
        	String key = pair.getKey();
        	Date value = pair.getValue();
        	System.out.println(key + " - " + value);
        }
    }
    
    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
