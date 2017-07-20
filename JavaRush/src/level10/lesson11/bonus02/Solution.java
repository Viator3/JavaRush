package level10.lesson11.bonus02;

import java.io.*;
import java.util.*;

/* It is necessary to add new functionality to the program
Task: The program enters a pair (number and string) from the keyboard and displays them on the screen.
New task: The program enters pairs (number and string) from the keyboard, saves them in HashMap.
An empty string is the end of data entry. Numbers can be repeated. Strings are always unique.
The entered data should not be lost!
The program then displays the contents of the HashMap on the screen.

Example input:
1
Mama
2
Frame
1
Soap

Example output:
2 Frame
1 Mama
1 Soap
*/

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String numbers = reader.readLine();
            if(numbers.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(numbers);
            String name = reader.readLine();
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
