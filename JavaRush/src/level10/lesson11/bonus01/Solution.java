package level10.lesson11.bonus01;

import java.io.*;
import java.util.*;

/* You need to fix the program to compile and work
Task: The program demonstrates the operation of HashMap: enters from the keyboard a set of pairs
(number and string),
Puts them in the HashMap and displays the contents of the HashMap.
*/

public class Solution {
	HashMap<Integer, String> map;
    Integer index;
    String name;

    public Solution() {
        this.map = new HashMap<Integer, String>();
        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            Integer index = pair.getKey();
            String name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
