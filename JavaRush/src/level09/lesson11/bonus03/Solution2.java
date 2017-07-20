package level09.lesson11.bonus03;
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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2 {
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
    	for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(isNumber(array[i]) && isNumber(array[j])){
                    Integer a = Integer.parseInt(array[i]);
                    Integer b = Integer.parseInt(array[j]);

                    if(b < a){
                        array[i] = Integer.toString(b);
                        array[j] = Integer.toString(a);
                    }
                }
                if(!(isNumber(array[i])) && !(isNumber(array[j]))){
                    if(!(isGreaterThan(array[i], array[j]))){
                        String c = "";
                            c = array[i];
                            array[i] = array[j];
                            array[j] = c;
                    }
                }
            }
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
