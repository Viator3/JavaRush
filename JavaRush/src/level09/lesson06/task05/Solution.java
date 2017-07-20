package level09.lesson06.task05;

import java.util.HashMap;

/* Exception when working with collections Map
To catch an exception (and display it on the screen), specifying its type, 
which occurs when the code is executed:
HashMap<String, String> map = new HashMap<String, String>(null);
Map.put (null, null);
Map.remove (null);
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (Exception e) {
            System.out.println(e + " : " + e.getMessage());
        }
    }
}
