package level08_1.lesson11.bonus02;

import java.io.*;
import java.util.*;

/* You need to add new functionality to the program
Task: The program determines which family (surname) lives in the house with the specified number.
New task: The program should work not with house numbers, but with cities:
Example input:
Moscow
Ivanovs
Kiev
Petrovs
London
Abramovichi

London

Example output:
Abramovichi
*/

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<String>();
        while (true) {
            String familyCity = reader.readLine();
            if (familyCity.isEmpty()) break;

            list.add(familyCity);
        }

        String city = reader.readLine();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(city)) {
                System.out.println(iterator.next());
            }
        }
    }
}
