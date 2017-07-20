package level10.lesson11.home05;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* Number of letters
Enter from the keyboard 10 lines and count in them the number of different letters
(for 26 letters of the alphabet). Output the result on the screen.
Example output:
a 5
b 8
c 3
d 7
e 0
...
z 9
*/

public class Solution {
	public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String abc = "abcdefghijklmnopqrstuvwxyz";
        
        String result = "";
        ArrayList<Character> characters = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            result += reader.readLine().toLowerCase();
        }

        for (char elementText : result.toCharArray()){
            characters.add((elementText));
        }
        for (char elementAlphabet : abc.toCharArray()) {
            System.out.println(elementAlphabet + " " +
            		Collections.frequency(characters, elementAlphabet));
        }
    }
}
