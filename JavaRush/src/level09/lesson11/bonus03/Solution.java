package level09.lesson11.bonus03;

import java.io.*;
import java.util.*;

/* Problem on algorithms
Task: The user enters a list of words (and numbers) from the keyboard. 
The words are displayed in ascending order, the numbers in descending order.
Example input:
Cherry
1
Bean
3
An Apple
2
0
Watermelon
Example output:
An Apple
3
Bean
2
Cherry
1
0
Watermelon
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        Map<Integer, String> mapResult = new TreeMap<>();
        Map<Integer, String> mapString = new TreeMap<>();
        Map<Integer, String> mapNumbers = new TreeMap<>();
        List<Integer> numbersList = new ArrayList<>();
        List<String> stringsList = new ArrayList<>();

        for (int index = 0; index < array.length; index++) {
            if (isNumber(array[index])) {
                mapNumbers.put(index, (array[index]));
            } else {
                mapString.put(index, array[index]);
            }
        }

        for (String value : mapNumbers.values()) {
            numbersList.add(Integer.parseInt(value));
        }
        
        Collections.sort(numbersList);
        
        int sizeNumbersList = numbersList.size();
        for (int key : mapNumbers.keySet()) {
            mapNumbers.put(key, numbersList.get((sizeNumbersList--) - 1).toString());
        }

        for (String value : mapString.values()){
            stringsList.add(value);
        }

        int sizeStringsList = stringsList.size();
        boolean counter = true;
        while (counter) {
            counter = false;
            for (int index = 0; index < sizeStringsList - 1; index++) {
                if (isGreaterThan(stringsList.get(index), stringsList.get(index + 1))) {
                    String temp = stringsList.get(index);
                    stringsList.set(index, stringsList.get(index + 1));
                    stringsList.set(index + 1, temp);
                    counter = true;
                }
            }
        }

        int count = 0;
        for (int key : mapString.keySet()) {
            mapString.put(key, stringsList.get(count++));
        }

        mapResult.putAll(mapNumbers);
        mapResult.putAll(mapString);

        count = 0;
        for (String value : mapResult.values()) {
            array[count] = value;
            count++;
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') || (!Character.isDigit(c) && c != '-') ) {
                return false;
            }
        }
        return true;
    }
}
