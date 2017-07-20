package level08.lesson11.home05;

import java.io.*;

/* Mom Soap Ramu. Now with a capital letter
Write a program that enters a string of text from the keyboard.
The program replaces in the text the first letters of all words for capital letters.
Output the result on the screen.

Example input:
   mama soap ramu.

Example output:
   Mama Soap Ramu.
*/
public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] ch = s.toCharArray();
        for (int num = 0; num < ch.length; num++) {
            if (num == 0 && ch[0] != ' ') {
                ch[0] = Character.toUpperCase(ch[0]);
            }
            if (ch[num] == ' ' && ch[num + 1] != ' ') {
                ch[num + 1] = Character.toUpperCase(ch[num + 1]);
            }
        }
        System.out.print(String.copyValueOf(ch));
    }
}
