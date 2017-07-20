package level09.lesson11.home05;

import java.io.*;

/* Vowels and consonants
Write a program that enters a string of text from the keyboard.
The program should display two lines:
1. The first line contains only vowels
2. The second - only consonant letters and punctuation marks from the entered line.
The letters should be joined with a space, each line must end with a space.

Example input:
Mom was washing the frame.
Example output:
o a a i e a e 
M m w s w s h n g t h f r m . 
*/
public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String resultVowels = "";
        String resultOtherCharacters = "";
        for (char symbol : reader.readLine().toCharArray()) {
            if (symbol != ' ') {
                if (isVowel(symbol)) {
                    resultVowels += symbol + " ";
                } else {
                    resultOtherCharacters += symbol + " ";
                }
            }
        }
        System.out.println(resultVowels);
        System.out.println(resultOtherCharacters);
    }

	public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  

        for (char d : vowels) {
            if (c == d) 
            	return true;
        }
        return false;
    }
}
