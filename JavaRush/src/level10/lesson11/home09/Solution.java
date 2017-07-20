package level10.lesson11.home09;

import java.io.*;
import java.util.*;

/* Same words in list
Enter from the keyboard in the list of 20 words. 
It is necessary to count the number of identical words in the list.
The result should be presented as a dictionary Map<String, Integer>, 
where the first parameter is a unique string,
And the second - the number of times this line was found in the list.
Display the contents of the dictionary on the screen.
In tests, the register (big / small letter) affects the result.
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        Map<String, Integer> result = new HashMap<String, Integer>();

        for (String text : list) {
            result.put(text, Collections.frequency(list, text));
        }
        return result;
    }
}
